package task11;

import java.util.Random;

public class SecondPerson extends Thread {
  private Random random = new Random();
  private final Account account;

  SecondPerson(Account account) {
    this.account = account;
  }

  @Override
  public void run() {
    Account.secondTread = 1;
    int operationSelection = 0;

    for (int j = 0; j < 100_000_000; j++) {
      while (Account.mainThread == 1) {
        try {
          sleep(5000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      operationSelection = random.nextInt(2);
      if (operationSelection == 1) {
        account.withdraw(random.nextInt(1000));
      } else {
        account.deposit(random.nextInt(1000));
      }
    }
    System.out.println("SecondTreadFinished-" + account.getBalance());
  }
}

