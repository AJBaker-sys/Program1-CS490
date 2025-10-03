public class SimpleThread{
    public static void main(String[] args) {
        MessageWriter msgThread = new MessageWriter("One");
        Thread threadOne = new Thread(msgThread);
        threadOne.start();

        try {
            threadOne.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\nmain program execution at end");
        //System.exit(0);

    }
}