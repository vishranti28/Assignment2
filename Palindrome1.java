public class Palindrome1 {
    public static void main(String[] args) {
        System.out.println("Palindrome numbers from 1 to 100 are:");
        for (int i = 1; i <= 100; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return original == reverse;
    }
}
