import java.io.*;
import java.util.LinkedList;

public class TestBufferedReader {
    public static void main(String[] args) {
        File file = new File("d:/222.txt");
        try(
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);)
        {
            while(true){
                String line = bufferedReader.readLine();
                if(null==line)
                    break;

                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try(FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);){

            printWriter.println("hello sao");
            printWriter.flush();
            printWriter.println("hello sads");
            printWriter.flush();
            printWriter.println("hello fdfd");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void removeComments(File file){
        LinkedList<String> list = new LinkedList<>();
        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);){
            while (true) {
                String s = bufferedReader.readLine();
                if(null==s)
                    break;


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
