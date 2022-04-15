package varargs_recursion_static;

public class Static {
    public static int x = 30;
    static {
        x = 50;
        System.out.println("Static block: " + x);
    }
    public static void moveTo(){
        System.out.println("MoveTo " + x);
        x = 100;
        System.out.println("MoveTo " + x);
    }
}
