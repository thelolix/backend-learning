import java.util.Scanner;

public class Hesap_Makinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Sayıyı giriniz: ");
        double sayi1 = input.nextDouble();

        System.out.println("2. Sayıyı giriniz: ");
        double sayi2 = input.nextDouble();


        System.out.println("Yapmak istediginiz işlemi giriniz: + - * / ");
        String sonuc = input.next();

        if(sonuc.equals("+"))
            System.out.println("Toplama işleminin sonucu: " + (sayi1 + sayi2));
        else if(sonuc.equals("-"))
            System.out.println("Cıkartma işleminin sonucu: " + (sayi1 - sayi2));
        else if(sonuc.equals("*"))
            System.out.println("Çarpma işleminin sonucu: " + (sayi1 * sayi2));
        else
            System.out.println("Bölme işleminin sonucu: " + (sayi1 / sayi2));

    }
}