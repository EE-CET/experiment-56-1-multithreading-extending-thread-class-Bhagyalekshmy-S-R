public class ExtendThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ExtendThread t = new ExtendThread();
        t.start();
    }
}

