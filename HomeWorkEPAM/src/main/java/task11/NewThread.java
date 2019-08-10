package task11;

public class NewThread implements Runnable {

    @Override
    public synchronized void run() {
        MainActions.operations();
    }
}
