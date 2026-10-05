package SDET_JAVA_CODING.Strings.Day01;

public class ReverseOnlyCharacters {

    public static void main(String[] args) {

        String s = "a1b2c3";

        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {

                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println("Original: " + s);
        System.out.println("Result  : " + new String(chars));
    }
}