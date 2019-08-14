package task11.FactoryMethod;

public class MyrzikBankFactory implements BankFactory {
  @Override
  public Bank createBank() {
    return new MyrzikBank();
  }
}
