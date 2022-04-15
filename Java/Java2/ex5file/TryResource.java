import java.io.FileOutputStream;

public class TryResource {
    public static void main(String[] args) {
        try (FileOutputStream fous = new FileOutputStream("Welcome.dat");) {
            String st = "Welcome to my try resource in java";
            fous.write(st.getBytes());
            System.out.println("File created");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
