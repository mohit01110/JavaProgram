import java.util.Scanner;

public class P6ArithmeticOperator {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter Two Number");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();

        System.out.println("Addition" +(a+b));
        System.out.println("Substraction" +(a-b));
        System.out.println("Multiplication" +(a*b));
        System.out.println("Division" +(a/b));
        System.out.println("Remainder" +(a%b));
    }
    
}
