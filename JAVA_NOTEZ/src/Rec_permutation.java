public class Rec_permutation {
    static void main(String[] args) {
        String str = "abc";

        permutations(str, "");
    }


    static void permutations(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        char ch = str.charAt(0);
        String remaining = str.substring(1);

        for (int i = 0; i <= result.length(); i++) {
            String newResult = result.substring(0 , i) + ch+ result.substring(i);

            permutations(remaining, newResult);
        }

    }
}
