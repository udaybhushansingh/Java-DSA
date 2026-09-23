import java.util.Scanner;
public class reversestring {
    static void main() {
/*
                int n = 123456789;
                int reversed = 0;

                while (n != 0) {
                    int lastDigit = n % 10;          // Extract the last digit
                    reversed = reversed * 10 + lastDigit; // Shift left and add digit
                    n = n / 10;                      // Remove the last digit
                }*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        // Use StringBuilder to reverse the string
        String reversed = new StringBuilder(original).reverse().toString();

        System.out.println("Reversed string: " + reversed);
        sc.close();


        /*System.out.println("Reversed number: " + reversed);*/
            }
        }

