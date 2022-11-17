package classes.threads;

public class Main extends Thread {
    public void run() {
        System.out.println("This code is running in a thread");
    }
}

/*
public class Main implements Runnable {
  public void run() {
    System.out.println("This code is running in a thread");
  }
 */
