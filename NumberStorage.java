public class NumberStorage {
    private int number;

    public NumberStorage() {
        this.number = 0;
    }

    public synchronized int getNumber() {
        return number;
    }

    public synchronized void increment() {
        number++;
    }

}