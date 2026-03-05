import java.util.Scanner;

public class input_alma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        double b;
        String str;

        System.out.print("kullanıcıdan istenilen degerleri giriniz:  " );
        a = input.nextInt();
        b = input.nextDouble();
        input.nextLine();
        str = input.nextLine();
        System.out.println("Gİrilen int deger: " + a);
        System.out.println("Gİrilen küsüratlı ifade: " + b);
        System.out.println("Gİrilen mentinsel ifade: " + str);
    }
}
