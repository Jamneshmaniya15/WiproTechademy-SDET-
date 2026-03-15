package multithreading;

class MessagePrinter implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread: " + i);
        }
    }

    public static void main(String[] args) {

        MessagePrinter obj = new MessagePrinter();
        Thread t1 = new Thread(obj);

        t1.start();
    }
}