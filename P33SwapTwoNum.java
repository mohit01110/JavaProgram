import java.util.Scanner;

public class P33SwapTwoNum {
    public static void main(String[] args) {
        int a,b,c=0;
        System.out.println("Enter Two Number ");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        b = r.nextInt();
        System.out.println("Befor swapping " + a +" "+ b);

        c=a;
        a=b;
        b=c;
        System.out.println("A = " + a + " and B = " + b );

    }
    
}
