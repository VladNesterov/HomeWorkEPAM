package task11.FactoryMethod;

public class SberBankFactory implements BankFactory {
  @Override
  public Bank createBank() {
    return new SberBank();
  }
}
