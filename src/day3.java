import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
       /* Scanner input = new Scanner(System.in);
        System.out.println("Degerin pozitif mi negatif mi ögrenmek için degeri giriniz: ");
        int deger = input.nextInt();

        if (deger > 0 ){
        System.out.println("Girilen deger pozitif");}
        else if (deger < 0){
            System.out.println("Girilen deger negatif");}
        else{
            System.out.println("Girilen deger 0'dır");
        */
    Scanner input = new Scanner(System.in);
    System.out.println("Degeri giriniz");
    int tek_cift = input.nextInt();

    if (tek_cift  % 2 == 0) {
        System.out.println("Cift");
    }
    else if (tek_cift % 2 == 1) {
        System.out.println("Tek");
    }
    else {
        System.out.println("Deger ne tek ne cift");
    }

    }

}

