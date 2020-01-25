package MultiThreading;

public class TaskBasedOnThreadClass extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Iteration #" + i);
        }        
    }
}
