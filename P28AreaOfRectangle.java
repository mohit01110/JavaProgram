import java.util.Scanner;

public class P28AreaOfRectangle {
    public static void main(String[] args) {
        int l,b,area;
        System.out.println("Enter value for Sides");
        Scanner r = new Scanner(System.in);
        l = r.nextInt();
        b = r.nextInt();
        area = l*b;
        System.out.println("Area of Rectangle " + area);
    }
    
}
