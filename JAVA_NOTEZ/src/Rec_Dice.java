public class Rec_Dice {
    static void main(String[] args) {
        int n = 2;
        int target = 5;

        dice(n, target, "");


    }
    static void dice(int n, int target, String result){
        if (n == 0) {
            if (target == 0) {
                System.out.println(result);
            }
            return;
        }

        for (int i = 1 ; i <= 6 ; i++ ){
            if (i <= target){
                dice(n -1  , target - i , result + i  );
            }
        }
         return ;
    }
}
