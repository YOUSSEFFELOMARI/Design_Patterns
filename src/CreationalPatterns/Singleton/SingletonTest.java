package CreationalPatterns.Singleton;

public class SingletonTest {
    public static void main(String[] args) {


        Thread thread1 = new Thread(() -> {
            Counter counter=Counter.getInstance();
            counter.addOne();
            System.out.println("T1-Counter : "+counter.counter);
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Counter counter=Counter.getInstance();
            counter.addOne();
            System.out.println("T2-Counter : "+counter.counter);
        });
        thread2.start();


    }
}
