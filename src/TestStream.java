
import java.io.*;

public class TestStream {

    public static void main(String[] args) {
        byte[] bytes = new byte[3];
        bytes[0] = (byte)0xE5;
        bytes[1] = (byte)0xB1;
        bytes[2] = (byte)0x8C;

        try {
            String gbk = new String(bytes, "utf-8");
            System.out.println(gbk);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        File file = new File("d:/222.txt");
        byte[] bytes1 = new byte[(int) file.length()];

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(bytes1);
            for(byte bb: bytes1){
                System.out.println(Integer.toHexString(bb&0xff));
            }
            System.out.println(new String(bytes1,"utf-8"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String s = new String("中");

        try {
            byte[] gbks = s.getBytes("utf-8");
            for(byte ccc: gbks){
                System.out.println(Integer.toHexString(ccc&0xff));
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
