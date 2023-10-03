import java.util.Scanner;

public class P21CalAverageofFiveMarks {
    public static void main(String[] args) {
        int a,b,c,d,e,sum;
        System.out.println("Enter Marks of Five Subjects");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        b = r.nextInt();
        c = r.nextInt();
        d = r.nextInt();
        e = r.nextInt();

        sum = a+b+c+d+e;
        System.out.println("Total Marks " + sum);
        double avg;
        //double avg=sum/5.0;
        //System.out.println("Average Marks " + avg);
        System.out.println("Average Marks " + (avg=sum/5.0));
    }
    
}
