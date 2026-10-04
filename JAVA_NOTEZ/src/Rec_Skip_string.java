public class Rec_Skip_string {

    public static void main(String[] args) {

        String str = "baccappled";

        String ans = skip(str, 0, "");

        System.out.println(ans);
    }

    static String skip(String str, int index, String result) {

        if (index == str.length()) {
            return result;
        }

        if (str.startsWith("apple", index)) {
            return skip(str, index + 5, result);
        }

        result += str.charAt(index);

        return skip(str, index + 1, result);
    }
}