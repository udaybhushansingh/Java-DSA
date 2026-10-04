 import java.util.ArrayList;

    public class Back_partition_palindrome {

        public static void main(String[] args) {
            String str = "aab";

            ArrayList<String> result = new ArrayList<>();

            partition(str, 0, result);
        }

        static void partition(String str, int index, ArrayList<String> result) {

            if (index == str.length()) {
                System.out.println(result);
                return;
            }

            for (int i = index; i < str.length(); i++) {

                String part = str.substring(index, i + 1);

                if (isPalindrome(part)) {

                    result.add(part);

                    partition(str, i + 1, result);

                    result.remove(result.size() - 1);
                }
            }
        }

        static boolean isPalindrome(String str) {

            int start = 0;
            int end = str.length() - 1;

            while (start < end) {
                if (str.charAt(start) != str.charAt(end)) {
                    return false;
                }

                start++;
                end--;
            }

            return true;
        }
    }