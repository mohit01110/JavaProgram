import java.util.Scanner;

public class P40FindFactorOfNumber {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter Number to Check Fator");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();

        for(int i=1; i<=a; i++)
        { 
            if(a%i==0)
            {
                System.out.println(i+ " " );
            }
        }
       
    }
    
}
