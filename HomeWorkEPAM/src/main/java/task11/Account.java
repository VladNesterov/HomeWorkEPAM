package task11;

class Account {
  private int balance;
  static volatile int mainThread = 0;
  static volatile int secondTread = 0;

  Account(int balance) {
    this.balance = balance;
  }

  int getBalance() {
    return balance;
  }

  void deposit(int amount) {
    synchronized (this) {
      balance = balance + amount;
    }
  }

  void withdraw(int amount) {
    synchronized (this) {
      if (balance >= amount) {
        balance = balance - amount;
      }
    }
  }
}

