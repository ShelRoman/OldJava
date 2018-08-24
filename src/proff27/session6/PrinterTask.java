//
package proff27.session6;


public class PrinterTask {

    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();
        PrintThread thread1 = new PrintThread();
        PrintThread thread2 = new PrintThread();
        thread1.printer = printer;
        thread2.printer = printer;
        thread1.start();
        thread2.start();
    }

    static class PrintThread extends Thread {
        Printer printer;

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                for (int i = 0; i < 20; i++) {
                    try {
                        printer.print("Test");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                this.interrupt();
            }

        }
    }

    static class Printer {

        public synchronized void print(String printedString) throws InterruptedException {
            try {
                System.out.println();
                System.out.print("[");
                Thread.sleep(1);
                System.out.print(printedString);
                Thread.sleep(1);
                System.out.print("]");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


}


