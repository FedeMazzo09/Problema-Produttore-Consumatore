import java.util.concurrent.Semaphore;

public class Buffer {

    private int value;

    private Semaphore empty = new Semaphore(1);
    private Semaphore full = new Semaphore(0);

    public void produce(int number) {

        try {
            empty.acquire();

            value = number;

            System.out.println("Prodotto: " + value);

            full.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void consume() {

        try {
            full.acquire();
            System.out.println("Consumato: " + value);
            empty.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}