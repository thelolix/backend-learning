import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci degeri girin: ");
        int sayi = input.nextInt();
        System.out.println("ikinci degeri girin: ");
        int sayi1 = input.nextInt();
        int toplam = sayi+sayi1;
        int cıkartma=sayi-sayi1;
        int çarpma = sayi*sayi1;
        double bölme = (double) sayi/sayi1;

        System.out.println("Sayıların toplamı: " + toplam);
        System.out.println("Sayıların cıkartması: " + cıkartma);
        System.out.println("Sayıların çarpımı: " + çarpma);
        System.out.println("Sayıların bölümü: " + bölme);
    }
}
