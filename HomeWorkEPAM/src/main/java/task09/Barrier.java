package task09;

public class Barrier implements Runnable {
  @Override
  public void run() {
    System.out.println("barrier reached");
  }
}

