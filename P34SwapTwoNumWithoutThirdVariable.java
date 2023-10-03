import java.util.Scanner;

public class P34SwapTwoNumWithoutThirdVariable {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter any two number");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        b = r.nextInt();

        System.out.println("Befor Swapping " + a + "  " + b);

        a =a+b;
        b = a-b;
        a = a-b;
         System.out.println("After Swapping " + a + "  " + b);

        
    }
    
}
