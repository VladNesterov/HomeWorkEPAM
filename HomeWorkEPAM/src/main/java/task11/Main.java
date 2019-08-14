package task11;

import task11.FactoryMethod.*;

import java.util.Scanner;

/**
 *There is a mainPerson and SecondPerson Thread. MainPerson thread always gets access.
 * SecondPerson thread is always waiting for the end of the mainPeron thread, if he works.
 */
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("We have Sber, Spb, Myrzik ATM");
    System.out.println("Choose and write your ATM ");
    String bank = in.nextLine();
    BankFactory bankFactory = createBank(bank);
    Bank usebank = bankFactory.createBank();
    usebank.greetingBank();

    Account account = new Account(100_0000);
    Thread mainPerson = new MainPerson(account);
    Thread secondPerson = new SecondPerson(account);
    mainPerson.start();
    secondPerson.start();
  }

  private static BankFactory createBank(String bank) {
    if (bank.equalsIgnoreCase("Sber")) {
      return new SberBankFactory();
    } else if (bank.equalsIgnoreCase("Spb")) {
      return new SpbBankFactory();
    } else if (bank.equalsIgnoreCase("Myrzik")) {
      return new MyrzikBankFactory();
    } else {
      throw new RuntimeException((bank + " is unknown bank"));
    }
  }
}
