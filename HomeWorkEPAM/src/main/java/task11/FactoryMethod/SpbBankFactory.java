package task11.FactoryMethod;

public class SpbBankFactory implements BankFactory {
  @Override
  public Bank createBank() {
    return new SpbBank();
  }
}
