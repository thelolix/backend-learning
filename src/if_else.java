import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Okul puanını gir");
        int num = input.nextInt();

        if (num >= 80 && num <= 100) {
            System.out.println("Tebrikler, geçtiniz. Harf notunuz AA");
        } else if (num >= 60 && num <= 79) {
            System.out.println("Tebrikler, geçtiniz. Harf notunuz BB");
        } else if (num >= 51 && num <= 59) {
            System.out.println("Tebrikler, geçtiniz. Harf notunuz CC");
        } else {
            System.out.println("Dersten geçemediniz. Harf notunuz FF");
        }
    }
}
