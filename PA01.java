import java.util.Scanner;

public class PA01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            int encryptedNumber = encrypt(numbers[i]);
            System.out.println(encryptedNumber);
        }
    }

    public static int encrypt(int number) {
        int[] digits = new int[4];
        for (int i = 3; i >= 0; i--) {
            digits[i] = (number % 10 + 5) % 10;
            number /= 10;
        }

        int temp = digits[1];
        digits[1] = digits[3];
        digits[3] = temp;

        int encryptedNumber = 0;
        for (int i = 0; i < 4; i++) {
            encryptedNumber = encryptedNumber * 10 + digits[i];
        }

        return encryptedNumber;
    }
}
