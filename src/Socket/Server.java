package Socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args){
        ServerSocket serverSocket = null;
        DataInputStream dataInputStream = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(8898);

            socket = serverSocket.accept();
            System.out.println("there is an new connection "+socket);

            InputStream inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);
            String str;
            while (true) {
                str = dataInputStream.readUTF();
                System.out.println("get a number: " + str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                dataInputStream.close();
                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
