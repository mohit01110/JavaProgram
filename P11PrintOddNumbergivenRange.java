import java.util.Scanner;

public class P11PrintOddNumbergivenRange {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Number of Term");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        for(int i=1; i<=n; i=i+2)
        {
            System.out.println(i);
        }
    }
    
}
