public class MessageWriter implements Runnable {
    private int myCounter;
    private String myName;

    public MessageWrier(String name) {
        myCounter = 0;
        myname = name;      
    }

    public void run() {
        for (int i=1; i<=10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace(); // TBD catch and deal with exception here
            }
            myCounter++;
            System.out.println(myName + " has woken up and this is message number " + myCounter);
        }
    }
}