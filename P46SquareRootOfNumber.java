import java.util.Scanner;

public class P46SquareRootOfNumber {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        double m = Math.sqrt(n);
        System.out.println("Square root of " + n + " is " + m);
        
    }
    
}
