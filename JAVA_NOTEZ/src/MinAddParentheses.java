public class MinAddParentheses {
    public static void main(String[] args) {
        System.out.println(minAdd("())"));     // 1
        System.out.println(minAdd("((("));     // 3
        System.out.println(minAdd("()"));      // 0
        System.out.println(minAdd("()))(("));  // 4

    }

    static int minAdd(String s) {
        int balance = 0;
        int add = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                balance++;
            } else {
                if (balance > 0) {
                    balance--;
                } else {
                    add++;
                }
            }
        }
        return add + balance;
    }
}
