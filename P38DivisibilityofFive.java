import java.util.Scanner;

public class P38DivisibilityofFive {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter any number");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();

        if(a%5==0)
        {
            System.out.println("Divisible by 5");
        }
        else
        {
            System.out.println("Not Divisibile by 5");
        }
    }
    
}
