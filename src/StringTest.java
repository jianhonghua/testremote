import java.io.File;
import java.io.FileInputStream;

public class StringTest {

    public void method() throws Throwable {
        File f = new File("d:/LOL.exe");
        new FileInputStream(f);
        }


    public static void main(String[] args) {
        int[] lowbound = {65,97,48};
        int[] upbound = {25,25,9};

        char[] cc = new char[3];
        int index;
        for(int i=0; i<cc.length; i++){
            index = (int)(Math.random()*3);
            cc[i] = (char)((int)(Math.random()*upbound[index])+lowbound[index]);
        }

        String ss = cc.toString();


        String a = "abcdefghijklmnopqrstuvwxyz0123456789";

        String str = "中国";
        System.out.println(str.charAt(0));

        String str2 = null;
        try {
            str2.length();
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("sha");
        }

        try {
            new StringTest().method();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
