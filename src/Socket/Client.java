package Socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Socket socket = null;
        DataOutputStream dataOutputStream = null;
        try {
            socket = new Socket("127.0.0.1", 8898);
            OutputStream outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                dataOutputStream.writeUTF(scanner.next());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                dataOutputStream.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
