import java.util.Scanner;

public class P15CheckVowelOrConsonent{
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter any Character");
        Scanner r = new Scanner(System.in);
        ch = r.next().charAt(0);

        if(ch== 'a'||ch== 'e'||ch== 'i'||ch== 'o'||ch== 'u'||ch== 'n')
        {
            System.out.println("Character is Vowel");
        }
        else 
        {
            System.out.println("Character is Consonent");
        }
    }
}