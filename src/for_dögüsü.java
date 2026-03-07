import java.util.Scanner;

public class for_dögüsü {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
         /*
         int n = input.nextInt();
         int toplam = 0;
        for (int i = 1; i < n ; i++){
         toplam += i;
         System.out.println( "İ'nin ilk degeri " + i + " Toplam degeri: " + toplam);
        }*/
        int m = input.nextInt();
        int faktöriyel = 1;
        for (int i =1; i<=m; i++){
            faktöriyel *= i;
            System.out.println(m + "! = " + faktöriyel);
        }
    }
}
