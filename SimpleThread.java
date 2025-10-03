public class SimpleThread{
    public static void main(String[] args) {
        NumberStorage sharedCounter = new NumberStorage();
        MessageWriter msgThread = new MessageWriter("One", 1000, sharedCounter);
        Thread threadOne = new Thread(msgThread);
        threadOne.start();

        MessageWriter msgThread2 = new MessageWriter("Two", 500, sharedCounter);
        Thread threadTwo = new Thread(msgThread2);
        threadTwo.start();

        try {
            threadOne.join();
            threadTwo.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\nmain program execution at end");
        System.exit(0);

    }
}