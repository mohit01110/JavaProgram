import java.util.Scanner;

public class P36CheckNumberisPositiveOrNegative {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter Number");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();

        if(a>=0)
        {
            System.out.println("Positive Number");
        }
        else
        {
            System.out.println("Negative Number");
        }
    }
    
}
