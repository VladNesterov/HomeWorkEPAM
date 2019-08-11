package task09;

public class Barrier extends HorseFactory implements Runnable {
  @Override
  public void run() {
    System.out.println("barrier reached");
  }
}

