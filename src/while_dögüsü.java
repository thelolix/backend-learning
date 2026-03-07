import java.util.Scanner;

public class while_dögüsü {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Yeni deger giriniz: ");
        int y1 = input.nextInt();
        int toplam = 0;
        int y2 = 1;
        while (y2 <= y1) {
            toplam += y2;
            System.out.println("y2'nin degeri " + y2 + " toplam deger:  " +  toplam);
            y2++;
        }




    }
}
