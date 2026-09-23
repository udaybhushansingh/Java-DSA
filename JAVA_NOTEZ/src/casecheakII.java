import java.util.Scanner;

public class casecheakII {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Char : ");

        char ch = sc.next().charAt(0) ;

        if (Character.isUpperCase(ch)){
            System.out.println(ch + " is an UPPERCASE letter.");
        }
        else if (Character.isLowerCase(ch)){
            System.out.println(ch + " is an LOWERCASE letter.");
        }
        else {
            System.out.println(ch + " is not an alphabetic letter.");
        }
        sc.close();
    }
}
