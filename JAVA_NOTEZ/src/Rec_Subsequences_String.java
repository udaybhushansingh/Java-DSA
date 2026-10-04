import java.util.ArrayList;

public class Rec_Subsequences_String {
    static void main(String[] args) {
        String str = "abc";

        ArrayList<String> ans = subseq(str, "", 0);
        System.out.println(ans);
    }


    static ArrayList<String> subseq(String str, String result, int index) {
        ArrayList<String> list;
        if (index == str.length()) {
            list = new ArrayList<>();
            list.add(result);
            return list;
        }

        char ch = str.charAt(index);

        ArrayList<String> left= subseq(str, result + ch, index + 1);

        ArrayList<String> right =subseq(str, result, index + 1);
        left.addAll(right);

        return left;
    }
}


// WITHOUT ARRAY LIST
///*/*public class Rec_Subsequence {
///
///     public static void main(String[] args) {
///         String str = "abc";
///
///         subseq(str, "", 0);
///     }
///
///     static void subseq(String str, String result, int index) {
///
///         if (index == str.length()) {
///             System.out.println(result);
///             return;
///         }
///
///         char ch = str.charAt(index);
///
///         // Take the character
///         subseq(str, result + ch, index + 1);
///
///         // Skip the character
///         subseq(str, result, index + 1);
///     }
/// }*/*/
