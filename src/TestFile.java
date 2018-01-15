import java.io.File;
import java.util.Date;

public class TestFile {

    public static void main(String[] args) {
        File file = new File("d:/5856e");
        System.out.println(file.getAbsolutePath());

        File file1 = new File("HelloWorld.java");
        System.out.println(file1.getAbsolutePath());

        File file2 = new File(file, "1.txt");
        System.out.println(file2.getAbsolutePath());

        System.out.println("File: "+file2.isDirectory()+file2.isFile()+file2.exists());

        long l = file2.lastModified();
        Date date = new Date(l);
        System.out.println(date);

        file2.setLastModified(0);

        File file3 = new File("d:/5856e/2.txt");
        file2.renameTo(file3);

        System.out.println(file2.getName());
    }
}
