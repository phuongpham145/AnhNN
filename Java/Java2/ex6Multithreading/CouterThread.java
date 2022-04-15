public class CouterThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print(" " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
        }
    }
}