import java.util.Scanner;

public class P13ifStatement {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Youer Age");
        Scanner obj = new Scanner(System.in);
        age = obj.nextInt();
        if(age>=18)
        {
            System.out.println("Your are Eligibile for Vote");
        }
        System.out.println("Thank You..!");
    }
    
}
