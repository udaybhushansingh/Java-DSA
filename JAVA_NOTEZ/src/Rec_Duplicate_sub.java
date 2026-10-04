import java.util.ArrayList;

public class Rec_Duplicate_sub {

    static void main(String[] args) {
        String str = "abc";

        ArrayList<String> ans = subseq(str, "", 0);


        ArrayList<String> unique =  new ArrayList<>();

        for(String s: ans ){
            if(!unique.contains(s)){
                unique.add(s);
            }
        }


        System.out.println(unique);
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
