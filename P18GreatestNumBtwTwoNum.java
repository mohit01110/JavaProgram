import java.util.Scanner;

public class P18GreatestNumBtwTwoNum {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter two Number");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        b = r.nextInt();
        
        if(a>b)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }
    
}
