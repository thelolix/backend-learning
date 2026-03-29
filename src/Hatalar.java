import java.util.*;

        // 0'a bölme hataları
        /*
        try {
            int a = 3333;
            int b = 0;
            System.out.println(a/b);}
        catch (Exception e){
            System.out.println("Hata Bölünemez");}
        }
    }

    try {
        String a = null;
        System.out.println(a.length());}
    catch (Exception e){
        System.out.println("Hata deger null girilmiş");
    }
    }
*/

public class Hatalar {
    public static void main(String[] args) {
        List<String>users=new ArrayList<>();
            users.add("Ahmet");
            users.add("Mehmet");
            users.add("Ali");
            users.add("Veli");
        try {
            System.out.println("0.İndex: " + users.get(4));}
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Hata fazla index girdiniz: " +e.getMessage());
        }
        }
    }



