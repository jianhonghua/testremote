import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class TestThread extends Thread{
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("thread is running");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i=0; i<5;i++){
                    try {
                        Thread.sleep(1000);
                        System.out.println("thread t1 is running");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };

        t1.start();

        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i=0; i<5;i++){
                    try {
                        Thread.sleep(1000);
                        System.out.println("thread t2 is running");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };

        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("this is here");

        Thread t3 = new Thread(){
            @Override
            public void run() {
                for (int i=0; i<5;i++){
                    try {
                        Thread.sleep(1000);
                        System.out.println("thread t3 is running");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };

        t3.start();

        Vector<Integer> vector = new Vector<>();

        vector.add(1);
        vector.add(2);

        System.out.println(vector.get(0));

        ArrayList<String> arrayList = new ArrayList<>();
        Collections.synchronizedList(arrayList);


//        TestThread testThread = new TestThread();
//        testThread.start();

    }
}
