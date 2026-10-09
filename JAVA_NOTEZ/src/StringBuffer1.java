public class StringBuffer1{
    static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Java DSA is fun");
        sb.deleteCharAt(4);
        sb.deleteCharAt(7);
        sb.deleteCharAt(9);

        sb.reverse();

        System.out.println(sb);
    }
}
