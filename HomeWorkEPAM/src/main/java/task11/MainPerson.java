package task11;

import java.util.Random;
import java.util.Scanner;

public class MainPerson extends Thread {
  private Scanner in = new Scanner(System.in);

  private final Account account;

  MainPerson(Account account) {
    this.account = account;
  }

  @Override
  public void run() {
    try {
      sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Account.mainThread = 1;
    String selection;
    try {
      while (Account.mainThread == 1) {
        System.out.println("What kind of surgery do you want to perform");
        System.out.println("1 - Put money");
        System.out.println("2 - Get money");
        System.out.println("3 - look money");
        System.out.println("4 - Exit");
        selection = in.next();
        switch (selection) {
          case ("1"):
            System.out.println("Write the amount you want to put");
            int moneyPut = in.nextInt();
            account.deposit(moneyPut);
            System.out.println("You money in account now " + account.getBalance());
            break;
          case ("2"):
            System.out.println("Write the amount you want to get");
            int moneyGet = in.nextInt();
            account.withdraw(moneyGet);
            System.out.println("You money in account now " + account.getBalance());
            break;
          case ("3"):
            System.out.println("You have-" + account.getBalance() + " money");
            break;
          case ("4"):
            System.out.println("Thank you for using our services");
            Account.mainThread = 0;
            break;
        }
      }
    } catch (ClassCastException e) {
      e.printStackTrace();
    }
  }
}
