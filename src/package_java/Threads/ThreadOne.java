package package_java.Threads;

public class ThreadOne extends Thread {
    private final Value value;

    public ThreadOne(Value value) {
        this.value = value;
    }

    @Override
    public void run() {
        while (this.value.value < 10) {
            synchronized (value) {
                this.value.value ++;
                try {
                    Thread.currentThread().sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("[1] value = " + value.value);
            }
        }
    }
}
