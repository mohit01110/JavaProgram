import java.util.Scanner;

public class P10SumofFirstNaturalNum {
    public static void main(String[] args) {
        int a,sum=0;
        System.out.print("Enter the Number");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        
        for(int i=1; i<=a; i++)
        {
            sum = sum+i;
            
        }
        System.out.println("Additon" + sum);
    }
    
}
