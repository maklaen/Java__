package package_java.Threads;

public class ThreadOne extends Thread {
    private final Value value;

    public ThreadOne(Value value) {
        this.value = value;
    }

    @Override
    public void run() {
        while (this.value.value <= 10) {
            synchronized (value) {
                this.value.value ++;
                System.out.println("[1] value = " + value.value);
            }
        }
    }
}
