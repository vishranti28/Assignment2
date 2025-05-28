public class exclude5and6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 6) {
                continue; // Skip 5 and 6
            }
            System.out.print(i + " ");
        }
    }
}