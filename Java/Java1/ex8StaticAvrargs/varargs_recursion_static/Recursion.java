package varargs_recursion_static;
public class Recursion {
    public int Sum(int n){
        int sum = 0;
        for(int i = 0; i <= n; i ++){
            sum += i;
        }
        return sum;
    }
    public int SumRecursion(int n){
        if(n <= 1) return 1;
        return n + SumRecursion(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("Sum with for : ");
        Recursion d = new Recursion();
        int result = d.Sum(5);
        System.out.println("Result : " + result);
        System.out.println("--------------------------------");
        int result2 = d.SumRecursion(5);
        System.out.println("Result 2 : " + result2);

    }
}
