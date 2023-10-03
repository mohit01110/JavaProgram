import java.util.Scanner;

public class P8SumofTwoNumberProg {
    public static void main(String[] args) {
        int a,b,sum;
        System.out.println("Enter Two Number");
        Scanner num1 = new Scanner(System.in);
        a = num1.nextInt();
        b = num1.nextInt();

        sum = a+b;
        System.out.println("Addition " +sum );
        
    }
    
}
