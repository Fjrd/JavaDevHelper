package MultiThreading;

public class Application {

    static Runnable taskBasedOnAnonymousClass = new Runnable() {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Iteration #" + i);
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(Application::doSome);
        thread.start();
    }
    
    static void doSome() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Iteration #" + i);
        }        
    }
}
