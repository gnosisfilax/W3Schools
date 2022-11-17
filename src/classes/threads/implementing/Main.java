package classes.threads.implementing;

public class Main implements Runnable{
    public static void main(String[] args) {
        Main obj = new Main();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}

/*
Differences between "extending" and "implementing" Threads

The major difference is that when a class extends the Thread class, you cannot extend any other class,
but by implementing the Runnable interface, it is possible to extend from another class as well,
like: class MyClass extends OtherClass implements Runnable.
 */
