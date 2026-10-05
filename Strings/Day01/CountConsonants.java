package SDET_JAVA_CODING.Strings.Day01;

public class CountConsonants {

    public static void main(String[] args) {

        String s = "12@ABCBCZXDF";

        int consonants = 0;
        int vowels = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'A' ||
                        ch == 'e' || ch == 'E' ||
                        ch == 'i' || ch == 'I' ||
                        ch == 'o' || ch == 'O' ||
                        ch == 'u' || ch == 'U') {

                    vowels++;

                } else {

                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}