package proff27.session6;

public class ThreadEx {

    public static void main(String[] args) throws InterruptedException {
        StoppableThread thread = new StoppableThread();
        thread.start();
        Thread.sleep(5);
        thread.interrupt();
    }


}

class StoppableThread implements Runnable {
    private Thread thread = new Thread(this);

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            System.out.println(i + " " + thread.getState() + " " + thread.getId());
        }

    }

    public void start() {
        thread.start();
    }

    public void interrupt() {
        thread.interrupt();
    }
}