package CreationalPatterns.Singleton;


public class Counter {
    public int counter;

    private static Counter instance=null;
    private Counter(){
    }

    public static Counter getInstance(){
        if (instance == null){
            synchronized (Counter.class) {
                if (instance == null)
                    instance = new Counter();
            }
        }
        return instance;
    }
    public void addOne(){
        counter++;
    }
}
