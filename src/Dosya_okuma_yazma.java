import java.io.File;
import java.util.Scanner;

public class Dosya_okuma_yazma {

    public static void main(String[] args) {

        try {
            File file = new File("users.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();

        } catch (Exception e) {
            System.out.println("Dosya okunamadı!");
        }
    }
}