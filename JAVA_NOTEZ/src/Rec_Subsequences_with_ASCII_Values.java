import java.util.ArrayList;

public class Rec_Subsequences_with_ASCII_Values {
    static void main(String[] args) {String str = "abc";

        ArrayList<String> ans = ascii(str, 0, "");

        System.out.println(ans);
    }



    static  ArrayList<String> ascii(String str , int  i , String result ) {
        ArrayList<String>list;
        if (i == str.length()) {
            list = new ArrayList<>();
            list.add(result);
            System.out.println(result);
            return list;
        }

        char ch = str.charAt(i);

        ArrayList<String> first = ascii(str,i + 1, result + ch);
        ArrayList<String> second = ascii(str, i + 1, result);
        ArrayList<String> third=ascii(str, i + 1, result + (int) ch);

        first.addAll(second);
        first.addAll(third);

        return first ;

    }

}/*public class Rec_Subsequences_with_ASCII_Values {

    public static void main(String[] args) {
        String str = "abc";

        ascii(str, 0, "");
    }

    static void ascii(String str, int i, String result) {

        if (i == str.length()) {
            System.out.println(result);
            return;
        }

        char ch = str.charAt(i);

        // Take character
        ascii(str, i + 1, result + ch);

        // Skip character
        ascii(str, i + 1, result);

        // Take ASCII value
        ascii(str, i + 1, result + (int) ch);
    }
}*/

