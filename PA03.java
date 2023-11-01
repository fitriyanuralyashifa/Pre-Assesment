import java.util.Scanner;

public class PA03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String kategori = "";
        String jenisKelamin = input.next();
        double beratBadan = input.nextDouble();
        double tinggiBadan = input.nextDouble();
        double tinggiMeter = tinggiBadan / 100.0;
        double bmi = beratBadan / (tinggiMeter * tinggiMeter);
        
        if (jenisKelamin.equalsIgnoreCase("Pria")) {
            if (bmi < 20.5) {
                kategori = "Kurus";
            } else if (bmi >= 20.5 && bmi < 27.0) {
                kategori = "Ideal";
            } else {
                kategori = "Gemuk";
            }
        } else if (jenisKelamin.equalsIgnoreCase("Wanita")) {
            if (bmi < 18.5) {
                kategori = "Kurus";
            } else if (bmi >= 18.5 && bmi < 25.0) {
                kategori = "Ideal";
            } else {
                kategori = "Gemuk";
            }
        } else {
            System.out.println("Jenis kelamin tidak valid.");
            return;
        }

        System.out.printf("%.2f", bmi);
        System.out.println(", " + kategori);
    }
} 