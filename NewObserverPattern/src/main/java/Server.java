import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Taposh
 */
public class Server implements Subject {

    private List<Observer> observers = new ArrayList<>();


    private static Scanner scanner = new Scanner(System.in);
    private static ServerSocket serverSocket;

    public Server(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
        ClientHandler.server = this;
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Server Started");
        Server server = new Server(serverSocket);
        try {
            while (!serverSocket.isClosed()) {
                Socket socket = serverSocket.accept();
                System.out.println("A new client has connected!");
                ClientHandler clientHandler = new ClientHandler(socket);
                Thread thread = new Thread((Runnable) clientHandler);
                thread.start();

            }
        } catch (IOException e) {
        }

    }

    @Override
    public void add(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyAll(SetMessage m) {
        for(Observer o: observers) {
            o.update(m);
        }
    }
}