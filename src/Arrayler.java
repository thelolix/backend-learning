import java.util.Scanner;

public class Arrayler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arry = {1,2,3};
        System.out.println(arry[0]);
        System.out.println(arry[1]);
        System.out.println(arry[2]);
    System.out.println("3 tane deger gir");
    int[] liste = new int[3];
    for (int i = 0; i < liste.length; i++) {
        liste[i]=input.nextInt();
    }
    for (int i = 0; i < liste.length; i++) {
            System.out.println(liste[i]);
        }




    /* liste[0] = 10;
    liste[1] = 20;
    liste[2]= 30;
    System.out.println(liste[0]);
    System.out.println(liste[1]);
    System.out.println(liste[2]);*/



    }
}
