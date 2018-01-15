import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestSocket {

    public static void main(String[] args) throws UnknownHostException, IOException{
        InetAddress localHost = InetAddress.getLocalHost();
        String hostAddress = localHost.getHostAddress();
        System.out.println(hostAddress);

        Process exec = Runtime.getRuntime().exec("ping "+"192.168.0.1");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line=bufferedReader.readLine())!=null){
            if(line.length()!=0){
                stringBuilder.append(line+"\r\n");
            }
        }

        System.out.println(stringBuilder);
    }
}
