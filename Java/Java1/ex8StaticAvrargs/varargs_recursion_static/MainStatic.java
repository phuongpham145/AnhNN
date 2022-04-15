package varargs_recursion_static;
public class MainStatic {
    public static void main(String[] args) {
        new Static();
        System.out.println("Before x : " + Static.x) ;
        Static.moveTo();
        System.out.println("After x : " + Static.x);
        
    }
}
