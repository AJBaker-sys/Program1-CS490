public class MessageWriter implements Runnable {
    private NumberStorage sharedCounter;
    private String myName;
    private int delay;

    public MessageWriter(String name, int delay, NumberStorage counter) {
        this.myName = name;
        this.delay = delay;
        this.sharedCounter = counter;
    }

    public void run() {
        for (int i=1; i<=10; i++) {
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sharedCounter.increment();
            System.out.println(myName + " has woken up and this is message number " + sharedCounter.getNumber());
        }
    }
}
