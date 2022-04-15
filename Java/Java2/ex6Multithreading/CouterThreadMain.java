public class CouterThreadMain {
    public static void main(String[] args) {
        CouterThread th1 = new CouterThread();
        th1.start();
        System.out.println("Completed !!!");
    }
}
