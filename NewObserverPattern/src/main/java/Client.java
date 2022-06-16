import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Taposh
 */
public class Client  {

    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String clientname;

    public Client(Socket socket, String clientname) {
        try {
            this.socket = socket;
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.clientname = clientname;
        } catch (IOException e) {
        }
    }

    public void sendMessage() {
        try {
            bufferedWriter.write(clientname);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            Scanner scan = new Scanner(System.in);
            while (socket.isConnected()) {
                String messageToSend = scan.nextLine();
                if (messageToSend == "_stop") {
                    socket.close();
                }
                bufferedWriter.write(clientname + ": " + messageToSend);
                bufferedWriter.newLine();
                bufferedWriter.flush();

            }
        } catch (IOException e) {
        }
    }

    public  void showMessage(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                String msgSent;
                while(socket.isConnected()){
                    try {
                        msgSent = bufferedReader.readLine();
                        System.out.println(msgSent);
                    } catch (IOException e){

                    }
                }
            }
        }).start();
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Client name: ");
        String username = scan.nextLine();
        Socket socket = new Socket("localhost", 1234);
        Client client = new Client(socket, username);

        client.sendMessage();
        client.showMessage();
    }
}
