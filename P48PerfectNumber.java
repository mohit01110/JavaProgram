//input number 6 ---> 1 2 3 4 5 
//6 -----> 1+2+3 = 6   

import java.util.Scanner;

public class P48PerfectNumber {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("Enter any number");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        for(int i=1; i<n; i++)
        {
            if(n%i==0)
            {
                sum = sum+i;
            }
        }
        if(n==sum)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not Perfect Number");
        }
        
        
    }
    
}
