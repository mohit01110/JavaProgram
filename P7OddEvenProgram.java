import java.util.Scanner;

public class P7OddEvenProgram {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Any Number");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        if(n%2==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }
    
}
