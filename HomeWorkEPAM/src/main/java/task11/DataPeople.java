package task11;

class DataPeople {
    private static volatile int dataMoneyAccount = 1000;

    static  synchronized void getDataMoneyAccount(int a) {
        dataMoneyAccount = dataMoneyAccount - a;
    }

    static synchronized void setDataMoneyAccount(int a) {
        dataMoneyAccount = dataMoneyAccount + a;
    }

    static int getDataMoneyAccount() {
        return dataMoneyAccount;
    }
}
