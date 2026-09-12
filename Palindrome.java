class Palindrome {
    public static void main(String args[]) {
        String str = "heooeho";
        boolean palindrome = true;

        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                palindrome = false;
 v                 break;
            }

            left++;
            right--;
        }

        if (palindrome) {
            System.out.println("Yes, the given string is a palindrome: " + str);
        } else {
            System.out.println("No, the given string is not a palindrome: " + str);
        }
    }
}
