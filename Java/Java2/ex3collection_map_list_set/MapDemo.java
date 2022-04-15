import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("Samsung", 200d);
        map.put("Nokia", 100d);
        map.put("Sony", 300d);
        System.out.println("Map : " + map.toString());
        map.put("Samsung", 400d);
        System.out.println("Map : " + map.toString());
        for (Map.Entry<String, Double> item : map.entrySet()) {
            System.out.print("Key : " + item.getKey());
            System.out.println(" - Value : " + item.getValue());
        }
    }
}
