import java.util.Scanner;

public class P35CharConvetLowerToUpperCase {
    public static void main(String[] args) {
        
        char ch,ch2;
        System.out.println("Enter any Character");
        Scanner ref = new Scanner(System.in);
        ch=ref.next().charAt(0);

        if(ch>='A' && ch<='Z')
        {
            ch2 = Character.toLowerCase(ch);
            System.out.println("Lower Case " + ch2 );
        }
        else
        {
            ch2 = Character.toUpperCase(ch);
            System.out.println("Upper Case " + ch2 );
        }
        
    }
    
}
