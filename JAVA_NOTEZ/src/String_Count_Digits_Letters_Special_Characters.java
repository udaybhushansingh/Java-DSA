import java.util.Scanner;

public class String_Count_Digits_Letters_Special_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int letters = 0;
        int digits = 0;
        int specialChar = 0;


        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                letters++;
            }
            else if (Character.isDigit(str.charAt(i))) {
                digits++;
            }
            else if (str.charAt(i) != ' ') {
                specialChar++;
            }

        }
        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChar);

    }
}
