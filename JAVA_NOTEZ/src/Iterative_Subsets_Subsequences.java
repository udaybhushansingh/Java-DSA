import java.util.ArrayList;

public class Iterative_Subsets_Subsequences {
    static void main(String[] args) {
        String str = " abc ";


        ArrayList<String> list= new ArrayList<>() ;
        list.add("");

        for (int i = 0 ; i < str.length() ; i ++ ){
            char ch = str.charAt(i) ;

            int size = list.size();

            for (int j = 0 ; j < size ; j++ ){
                list.add(list.get(j)+ ch);
            }

        }
        System.out.println(list);
    }
}
