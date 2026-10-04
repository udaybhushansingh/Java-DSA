public class String_Count_Vowels_and_Consonants {
    public static void main(String[] args) {

        String str = "madam";
        char[] arr = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i'
                    || arr[i] == 'o' || arr[i] == 'u') {

                vowels++;

            } else {

                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}