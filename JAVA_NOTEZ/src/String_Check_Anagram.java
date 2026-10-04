import java.util.Scanner;

public class String_Check_Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();

        if (str.length() == str2.length()) {

            for (int i = 0; i < str.length(); i++) {

                char ch1 = str.charAt(i);
                int count1 = 0;
                int count2 = 0;

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch1) {
                        count1++;
                    }
                }

                for (int j = 0; j < str2.length(); j++) {
                    if (str2.charAt(j) == ch1) {
                        count2++;
                    }
                }

                if (count1 != count2) {
                    System.out.println("Not Anagram");
                    return;
                }
            }

            System.out.println("Anagram");
        }
    }
}