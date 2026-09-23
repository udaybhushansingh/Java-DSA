import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Department (IT/HR): ");
        String dept = sc.next();

        // Outer Switch
        switch (dept) {
            case "IT":
                System.out.println("Welcome to the IT Department.");
                System.out.print("Enter your role (Dev Tester): ");
                String role = sc.next();

                // Inner (Nested) Switch
                switch (role) {
                    case "Dev":
                        System.out.println("Access granted to the Coding Repository.");
                        break;
                    case "Tester":
                        System.out.println("Access granted to the QA Testing Tools.");
                        break;
                    default:
                        System.out.println("Unknown IT role.");
                        break;
                }
                break; // Break for the outer IT case

            case "HR":
                System.out.println("Welcome to the HR Department. Access granted to Payroll.");
                break;

            default:
                System.out.println("Invalid Department.");
                break;
        }

        sc.close();
    }
}

