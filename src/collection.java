import java.util.*;

public class collection {

    public static void main(String[] args){

        // LIST
        List<String> users = new ArrayList<>();
        users.add("Ahmet");
        users.add("Mehmet");

        // SET
        Set<String> dersler = new HashSet<>();
        dersler.add("Matematik");
        dersler.add("Türkçe");

        // MAP
        Map<Integer,String> ogrenciId = new HashMap<>();
        ogrenciId.put(1,"Ahmet");
        ogrenciId.put(2,"Mehmet");

        System.out.println(users);
        System.out.println(dersler);
        System.out.println(ogrenciId.get(1));
    }
}