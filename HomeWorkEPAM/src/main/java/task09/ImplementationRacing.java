package task09;

import java.util.Scanner;
import java.util.concurrent.CyclicBarrier;

class ImplementationRacing {
  void run() {
    //read
    try {
      Scanner in = new Scanner(System.in);
      System.out.println("Do you want to play. Write yes or no");
      String wantToPlay = in.next();
      System.out.println("How much money do you have. Write quantity");
      int money = in.nextInt();
      if (money < 0) {
        throw new ClassCastException();
      }
      for (int i = 0; i < 5; i++) {
        System.out.println(HorseFactory.createHorse().get(i).toString());
      }
      while (wantToPlay.equals("yes") & (money > 0)) {
        //    wager - Ставка
        System.out.println("Write your wager");
        int wager = in.nextInt();
        System.out.println("Choose a horse. Write number");
        int horseNumber = in.nextInt();
        if (horseNumber < 0 | horseNumber > 4) {
          System.err.print("Horse Number ");
          throw new ClassCastException();
        }
        CyclicBarrier barrier = new CyclicBarrier(5, new Barrier());
        for (int i = 0; i < 6; i++) {
          // Create Thread with constructor in class Horse CyclicBarrier 69 line
          new Horse(barrier, HorseFactory.createHorse().get(i).getName());
        }
        int max = 0;
        int winnerHorseID = 0;
        for (int i = 0; i < DataCyclicBarrier.dataHorseInTheFinish.size(); i++) {
          if (DataCyclicBarrier.dataHorseInTheFinish.get(i) > max) {
            max = DataCyclicBarrier.dataHorseInTheFinish.get(i);
            winnerHorseID = i;
          }
        }
        System.out.println(DataCyclicBarrier.dataHorseInTheFinish);
        if (wager > money) {
          System.out.println("You can't bet more than you have. " +
            "If you lose, you lose everything. Your wager " + money);
          wager = money;
        }
        if (horseNumber == winnerHorseID) {
          money = money + wager;
          System.out.println("You won, your money " + money);
        } else {
          money = money - wager;
          System.out.println("You lose, your money " + money);
        }
        if (money < 1) {
          System.out.println("Sorry you not have money and you can not continue in the game");
        } else {
          System.out.println("Do you want to play again. Write yes or no");
        }
        String wantToPlay1 = in.next();
        if (!wantToPlay1.equals("yes")) {
          wantToPlay = "no";
        }
        DataCyclicBarrier.dataHorseInTheFinish.clear();
        DataCyclicBarrier.dataHorseInTheRun.clear();
      }
    } catch (ClassCastException e) {
      System.err.println("Incorrect entry");
    }
  }
}