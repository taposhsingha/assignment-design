import java.io.*;
import java.net.Socket;
import java.util.ArrayList;


/**
 *
 * @author Taposh
 */
public class ClientHandler implements Runnable , Observer{

    public static ArrayList<ClientHandler> clientHandlers = new ArrayList<>();
    private Socket socket;
    public static Server server ;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String clientUsername;

    public ClientHandler(Socket socket) {
        try {
            this.socket = socket;

            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.clientUsername = bufferedReader.readLine();
            clientHandlers.add(this);
            server.add(this);
            broadcastMessage("Server: "+clientUsername+ " has entered the chat!");

        } catch (IOException e) {

        }
    }

    @Override
    public void run() {
        String messageFromClient;

        while (socket.isConnected()) {
            try {
                messageFromClient = bufferedReader.readLine();
                System.out.println(messageFromClient);
                broadcastMessage(messageFromClient);

            } catch (IOException e) {
            }

        }
    }

    public void broadcastMessage(String message){
        for (ClientHandler clientHandler:clientHandlers){
            try{
                if (!clientHandler.clientUsername.equals(clientUsername)){
                clientHandler.bufferedWriter.write(message);
                clientHandler.bufferedWriter.newLine();
                clientHandler.bufferedWriter.flush();}
            }catch (IOException e){

            }
        }
        SetMessage a = new SetMessage(message);
        server.remove(this);
        server.notifyAll(a);
        server.add(this);
    }


    @Override
    public void update(SetMessage m) {
        try{
            bufferedWriter.write(m.getMessage());
            bufferedWriter.flush();
        }catch (IOException e){

        }
    }
}

