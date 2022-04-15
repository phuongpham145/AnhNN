import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<>();
        ArrayList<String> questions = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i< 5; i++){
            System.out.printf("Nhap phan tu thu %d: ", i + 1);
            Double d = scanner.nextDouble();
            nums.add(d);
        }
        for(Double num : nums){
            System.out.print(" " + num);
        }
        System.out.println();
        scanner.nextLine();
        for(int i=0; i< 5; i++){
            System.out.printf("Nhap cau hoi thu %d: ", i + 1);
            String question = scanner.nextLine();
            questions.add(question);
        }
        Collections.shuffle(questions);
        System.out.println("Gia tri cac phan tu : \n");
        for(String question : questions){
            System.out.printf(" %s", question);
        }
        scanner.close();
    }
}