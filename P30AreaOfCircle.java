import java.util.Scanner;

public class P30AreaOfCircle {
    public static void main(String[] args) {
        final double Pie =3.14;
        double radius;
        int r;
        System.out.println("Enter Radius of Circle");
        Scanner rad = new Scanner(System.in);
        r = rad.nextInt();

        radius = Pie*r*r;
        System.out.println("Area of Circle "+radius);


    }
    
}
