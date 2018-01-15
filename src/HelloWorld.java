import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello github");
        System.out.println("hello world");
        System.out.println("hello IDEA");
        System.out.println(Math.round(3.14));
        System.out.println(Math.round(3.56));
        System.out.println((int)(Math.random()*5)+5);
        System.out.println(Math.sqrt(10));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.pow(1+(1/(double)Integer.MAX_VALUE),Integer.MAX_VALUE));
        System.out.println(Long.MAX_VALUE);

        String name = "waiwai";
        int num = 10;

        String sen = "%s killed %d animal%n";
        System.out.printf(sen,name,num);

        System.out.format("%,8d%n",202020);
        System.out.format("%8d%n",202020);
        System.out.format("%.2f%n",Math.PI);
        System.out.format(Locale.UK,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter location: ");
//        String next1 = scanner.nextLine();
//        System.out.println("please enter location: ");
//        String next2 = scanner.nextLine();
//        System.out.println("please enter location: ");
//        String next3 = scanner.nextLine();
//
//        System.out.println(next1 + next2 + next3);

        char[] array = new char[5];
        String[] ss = new String[8];
        int[] low = {65,97,48};//lower boundry
        int[] bound = {26,26,9};//top bound

        int index;

        for(int j=0; j<ss.length;j++) {
            for (int i = 0; i < array.length; i++) {
                index = (int) (Math.random() * 3);//random index
                array[i] = (char) (((int) (Math.random() * bound[index])) + low[index]);
            }
            ss[j] = new String(array);
        }

        Arrays.sort(ss);

        for(String str: ss) {
            System.out.println(str);
        }

        String temp;

        for(int i=0; i<ss.length-1;i++){
            for(int j=i+1; j<ss.length; j++){
                if(ss[i].compareToIgnoreCase(ss[j])<0){
                    temp = ss[i];
                    ss[i] = ss[j];
                    ss[j] = temp;
                }
            }
        }

        for(String str: ss) {
            System.out.println(str);
        }
    }
}
