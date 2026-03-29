import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Mini_proje {
    public static void main(String[] args) {
       try {
           Scanner input = new Scanner(System.in);
           System.out.println("İsimleri giriniz");
           String msj = input.nextLine();

           FileWriter sa = new FileWriter("users.txt", true);
           sa.write(msj +"\n");
           sa.close();

           File file = new File("users.txt");
           Scanner reader = new Scanner(file);

           System.out.println("\nDosyadaki isimler:");
           while (reader.hasNextLine()) {
               String data = reader.nextLine();
               System.out.println(data);
           }
           reader.close();

       } catch (IOException e) {
           System.out.println("Dosya hatası oluştu!");

       }

    }
}