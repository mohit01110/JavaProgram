import java.util.Scanner;

public class P25MultiPlicationTable {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter any Number");
        Scanner r = new Scanner(System.in);
        num = r.nextInt();
        System.out.println("Multiplication of " + num);
        for(int i=1; i<=10; i++)
        {
            
            System.out.println(num + "*" + i + "=" + num*i);
            
        }
    }
    
}
