import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConlectionDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(4);
        Collections.sort(list);
        System.out.println("List : " + list.toString());
        if(Collections.binarySearch(list, 8) >= 0){
            System.out.println(" 8 in list");
        } else {
            System.out.println("8 is not in list");
        }
        Collections.shuffle(list);
        System.out.println("List : " + list.toString());
        Collections.sort(list, (a, b) -> b - a);
        System.out.println("List : " + list.toString());

    }
}
