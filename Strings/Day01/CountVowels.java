package SDET_JAVA_CODING.Strings.Day01;

public class CountVowels {

    public static void main(String[] args) {

        String s = "automation";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = Character.toLowerCase(s.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {

                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}