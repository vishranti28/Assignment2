public class armstrongnumber1 {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }
}