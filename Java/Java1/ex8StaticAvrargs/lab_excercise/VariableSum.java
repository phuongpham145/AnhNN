package lab_excercise;

public class VariableSum {
    public static Double sum(Double... nums) {
        double sum = 0;
        for (double num : nums) {
            sum += num;
        }
        return sum;
    }
    public static Double Min(Double... nums) {
        Double min = nums[0];
        for(Double num : nums) {
            min = Math.min(min, num);
        }
        return min;
    }
    public static Double Max(Double... nums) {
        Double max = nums[0];
        for(Double num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }
    public static String toUpperFirstChar(String name){
        String[] ars = name.split(" ");
        StringBuilder subs = new StringBuilder();
        for(int i = 0; i < ars.length; i++) {
            String item = ars[i];
            if(!item.equals("")){
                String ch = item.substring(0, 1).toUpperCase();
                item = ch + item.substring(1).toLowerCase();
                subs.append(item).append(" ");
            }
        }
        return subs.toString().trim();
    }

    public static void main(String[] args) {
        String name = "nguyen van an";
        String newName = toUpperFirstChar(name);
        System.out.println("New name : " + newName);
        name = "tran     van        tien";
        System.out.println("New name : " + toUpperFirstChar(name));
        Double result = sum(2.0);
        System.out.println("Result: " + result);
        result = sum(3.0, 5.6, 7.0);
        System.out.println("Result: " + result);
        result = Max(2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 9.9);
        System.out.println("Maximum: " + result);
        result = Min(2.3, 4.5);
        System.out.println("Minimun: " + result);
    }

}
