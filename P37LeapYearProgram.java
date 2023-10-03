import java.util.Scanner;

public class P37LeapYearProgram {
    //Century (100% = 0 and 400% = 0)
    public static void main(String[] args) {
        int y;
        System.out.println("Enter any Year");
        Scanner r = new Scanner(System.in);
        y = r.nextInt();

        if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
        {   
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not Leap Year");
        }
        
    }
    
}
