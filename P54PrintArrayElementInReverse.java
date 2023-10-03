import java.util.Scanner;

public class P54PrintArrayElementInReverse {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner r = new Scanner(System.in);
        System.out.println("Enter element in array ");
        for(int i=0; i<a.length; i++)
        {
            a[i] = r.nextInt();
        }
        System.out.print("Array Element");
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nArray Reverse Order ");
        for(int i=a.length-1; i>=0; i--)
        {
            System.out.println(a[i] + " ");
        }        
        
    }
    
}
