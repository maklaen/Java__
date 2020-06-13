package package_java.Threads;

public class ThreadTwo extends Thread {
    private final Value value;

    public ThreadTwo(Value value) {
        this.value = value;
    }

    @Override
    public void run() {
        if (this.value.value > 10) {
            synchronized (value) {
                this.value.value -= 10;
                System.out.println("[2] value = " + value.value);
            }
        }
    }
}
