package task11;

public class RunAtm {
    public static void main(String[] args) {
        NewThread newThread=new NewThread();
        Thread person1 = new  Thread(newThread);
        Thread person2 = new  Thread(newThread);
        person1.start();
        person2.start();
//      MainActions.operations();
    }

}

