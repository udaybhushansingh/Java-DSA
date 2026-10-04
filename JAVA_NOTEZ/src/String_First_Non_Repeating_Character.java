import java.util.Scanner;

public class String_First_Non_Repeating_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(str.charAt(i));
                return;
            }
        }
        // System.out.println(str.charAt(i));
    }
}


