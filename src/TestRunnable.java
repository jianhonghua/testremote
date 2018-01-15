public class TestRunnable implements Runnable {
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
                System.out.println("Runnable is ok");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        TestRunnable runnable = new TestRunnable();

        Thread thread = new Thread(runnable);

        thread.start();
    }
}
