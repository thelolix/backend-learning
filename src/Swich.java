import java.util.Scanner;

public class Swich {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir ay numarası girin: ");
        int ayNo = input.nextInt();
        String ayİsim ;

        switch (ayNo) {
            case 1:
                ayİsim = "Ocak";
                break;
            case 2:
                ayİsim= "Şubat";
                break;
            case 3:
                ayİsim= "Mart";
                break;
            case 4:
                ayİsim="Nisan";
                break;
            case 5:
                ayİsim="Mayıs";
                break;
            case 6:
                ayİsim="Haziran";
                break;
            case 7:
                ayİsim="Temmuz";
                break;
            case 8:
                ayİsim="Agustos";
                break;
            case 9:
                ayİsim="Eylül";
                break;
            case 10:
                ayİsim="Ekim";
                break;
            case 11:
                ayİsim="Kasım";
                break;
            case 12:
                ayİsim="Aralık";
                break;
            default:
                ayİsim="Yalnış rakam girdini 1-12 arasında rakam giriniz";
        }
    System.out.println("Secilen ay: "+ayİsim);
    }
}
