public class Balance_paren {
    static void main(String[] args) {
        System.out.println(minInsertions("(()))"));
        System.out.println(minInsertions("())"));
        System.out.println(minInsertions("((("));
        System.out.println(minInsertions(")("));
    }

    static int minInsertions(String s) {

        int insertion = 0;
        int open = 0;

        int i = 0;


        while (i < s.length()) {
            char ch = s.charAt(i);

            if (ch == '(') {
                open++;
                i++;
            } else {
                insertion++;
                 i++;
            }
            if (open > 0) {
                open--;
            } else {
                insertion++;
            }
            insertion += open * 2;


        }
        return insertion;
    }
}