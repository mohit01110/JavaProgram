import java.util.Scanner;

public class P9NaturalNumberProg {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter No of Term ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        for(int i=1; i<=n; i++)
        {
            System.out.println(i + " ");
        }
    }
    
}
