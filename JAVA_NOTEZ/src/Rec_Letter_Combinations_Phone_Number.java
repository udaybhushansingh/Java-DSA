public class Rec_Letter_Combinations_Phone_Number {
    static void main(String[] args) {
        String[] keypad = {
                "", "", "abc", "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        String digits = "23";
        phone(digits, "", 0, keypad);
    }

    static void phone(String digits, String result, int index, String[] keypad) {
        if (index == digits.length()){
            System.out.println(result);
            return;
        }

        String letters = keypad[digits.charAt(index) - '0'];

        for(int i = 0 ; i <= letters.length() ; i ++ ){
            phone(digits , result + letters.charAt(0) , index + 1  , keypad );
        }
    }
}
