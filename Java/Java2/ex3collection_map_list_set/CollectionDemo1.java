import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class CollectionDemo1 {
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(2);
       System.out.println("List : " + list.toString());  
       Set<Integer> set = new HashSet<>();
       set.add(1);
       set.add(2);
       set.add(3);
       set.add(2);
       System.out.println("Set : " + set.toString());   
       set.addAll(list);
       System.out.println("Set : " + set.toString());
          
    }
}