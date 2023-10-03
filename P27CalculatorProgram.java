import java.util.Scanner;

public class P27CalculatorProgram {
    public static void main(String[] args) {
        int n1,n2,ch,cal;
        System.out.println("Enter Two Numbers");
        Scanner r = new Scanner(System.in);
        n1 = r.nextInt();
        n2 = r.nextInt();
        System.out.println("Select Operation ");
        ch= r.nextInt();
        
        if(ch==1)
        {
            cal = n1+n2;
            System.out.println("Addition " + cal);
        }
        else if(ch==2)
        {
            cal = n1-n2;
            System.out.println("Subtraction " + cal);
        }
        else if(ch==3)
        {
            cal = n1*n2;
            System.out.println("MultiPlication " + cal);
        }
        else if(ch==4)
        {
            cal = n1/n2;
            System.out.println("Division " + cal);
        }
        else
        {
            cal = n1%n2;
            System.out.println("Remainder " + cal);
        }
    }
    
}
