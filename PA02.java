import java.util.Scanner;
public class PA02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int A = input.nextInt();
        int B = input.nextInt();
        int hasil = A + B;
        String kalimat = convertToWords(hasil);
        System.out.println(kalimat);
        input.close();
    }
    
    public static String convertToWords(int number) {
        String[] satuan = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan"};
        String[] puluhan = {"", "sepuluh", "dua puluh", "tiga puluh", "empat puluh", "lima puluh", "enam puluh", "tujuh puluh", "delapan puluh", "sembilan puluh"};
        
        if (number == 0) {
            return "nol";
        }
        
        String kalimat = "";
        int ratusan = number / 100;
        int puluhanan = (number % 100) / 10;
        int satuanan = number % 10;
        
        if (ratusan > 0) {
            kalimat += satuan[ratusan] + " ratus ";
        }
        if (puluhanan == 1) {
            kalimat += puluhan[puluhanan + satuanan];
        } else {
            kalimat += puluhan[puluhanan] + " " + satuan[satuanan];
        }
        
        return kalimat.trim();
    }
}
