import java.util.Scanner;

public class P42ReverseNumber {
    public static void main(String[] args) {
        int a,p;
        System.out.println("Enter any number");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();

        while(a>0)
        {
            p = a%10;
            System.out.print(p);
            a=a/10;

        }
        


    }
    
}
