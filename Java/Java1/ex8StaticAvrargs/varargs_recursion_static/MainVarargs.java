package varargs_recursion_static;

public class MainVarargs {
    public static int sum(int... nums) {
        int s = 0;
        for (int item : nums) {
            s += item;
        }
        return s;
    }
    public static String Concat(String ... args){
        String st = "";
        for(String item : args){
            st += " " + item;
        }
        return st;
    }
    public static void main(String[] args) {
        System.out.println("1: " + Concat("Hello", "World", "How"));
        System.out.println("2: " + Concat("Hello", "World", "How"));
        System.out.println("3: " + Concat("Hello", "World"));
        System.out.println("4: " + Concat("Hello", "World", "How", "Are"));

        System.out.println("Sum : " + sum(3));
        System.out.println("Sum : " + sum(3, 5, 7));
        System.out.println("Sum : " + sum(3, 2, 8, 1));
        System.out.println("Sum : " + sum(3, 0, 9, 8, 6, 5));
        int[] ars = new int[] { 1, 2, 5, 6, 7, 8 };
        System.out.println("Sum : " + sum(ars));
    }
}
