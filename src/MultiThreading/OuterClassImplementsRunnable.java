package MultiThreading;

public class TaskBasedOnOuterClass implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Iteration #" + i);
        }
    }
}
