import java.util.Scanner;

public class P41PrintNumberofDaysInMonth {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter Month Number");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();

        if(a==1)
        {
            System.out.println("January = 31 Days");
        }
        else if(a==2)
        {
            System.out.println("February = 28 Days");
        }
        else if(a==3)
        {
            System.out.println("March = 31 Days");
        }
        else if(a==4)
        {
            System.out.println("April = 30 Days");
        }
        else if(a==5)
        {
            System.out.println("May = 31 Days");
        }
        else if(a==6)
        {
            System.out.println("June = 30 Days");
        }
        else if(a==7)
        {
            System.out.println("July = 31 Days");
        }
        else if(a==8)
        {
            System.out.println("August = 31 Days");
        }
        else if(a==9)
        {
            System.out.println("September = 30 Days");
        }
        else if(a==10)
        {
            System.out.println("October = 31 Days");
        }
        else if(a==11)
        {
            System.out.println("November = 30 Days");
        }
        else if(a==12)
        {
            System.out.println("December = 31 Days");
        }
        else
        {
            System.out.println("Invalid Choice");
        }
    }
    
}
