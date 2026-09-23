import java.util.Scanner;

public class SWTICH {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name of fruits: ");
        String fruit = sc.next() ;

        switch (fruit){
            case "Mango" :
            System.out.println("KING of fruits ");
            break;
            case "apple" :
                System.out.println("4 of fruits ");
                break;
            case "orange" :
                System.out.println("3 of fruits ");
                break;
            case "pineapple" :
                System.out.println("2 of fruits ");
                break;
            case "grapes" :
                System.out.println("1 of fruits ");
                break;
            default:
                System.out.println("enter vaild name of fruits");
        }

    }
}
