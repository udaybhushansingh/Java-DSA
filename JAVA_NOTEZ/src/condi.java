import java.util.Scanner;

public class condi {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Salary: " );
        int salary = sc.nextInt();


        if (salary <= 1000){
            salary = salary + 1000;
        }
        else {
            salary = salary + 20000;
        }
        System.out.println("Final salary: " + salary);
    }
}
