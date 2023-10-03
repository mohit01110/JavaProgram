import java.util.Scanner;

public class P24EligibleforVoteorNot {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age");
        Scanner r = new Scanner(System.in);
        age = r.nextInt();

        if(age>18)
        {
            System.out.println("You are Eligibile for Vote");
        }
        else
        {
            System.out.println("You Cannot Vote");
        }
    }
    
}
