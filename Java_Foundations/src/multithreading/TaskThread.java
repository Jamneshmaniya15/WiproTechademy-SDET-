package multithreading;

class TaskThread extends Thread {

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " running " + i);
        }
    }

    public static void main(String[] args) {

        TaskThread t1 = new TaskThread();
        TaskThread t2 = new TaskThread();
        TaskThread t3 = new TaskThread();

        t1.start();
        t2.start();
        t3.start();
    }
}