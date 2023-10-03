import java.util.Scanner;

public class P31AreaofSquare {
    public static void main(String[] args) {
        int side,area;
        System.out.println("Enter Side for area of Square");
        Scanner r = new Scanner(System.in);
        side = r.nextInt();

        area = side*side;
        System.out.println("Area of Square " + area);


    }
    
}
