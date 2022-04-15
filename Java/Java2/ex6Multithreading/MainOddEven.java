public class MainOddEven {
    public static void main(String[] args) {
        OddThread th1 = new OddThread();
        EvenThread th2 = new EvenThread();
        th1.start();
        try {
            th1.join();
        } catch (InterruptedException e) {
        }
        th2.start();
        System.out.println("Completed!!!");
    }
}
