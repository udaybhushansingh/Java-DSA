public class Rec_skip_char {
    static <string> void main(String[] args) {
        String str = "abbabba";
        String ans = skip(str, 0, "");

        System.out.println(ans);
    }



    static String skip(String str, int index, String result) {

        if (index == str.length()) {
            return result;
        }

        if (str.charAt(index) != 'a') {
            result += str.charAt(index);
        }

        return skip(str, index + 1, result);
    }
}
