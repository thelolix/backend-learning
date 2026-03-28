public class Encapsulation {
    private String name;
    private int id;
    private String email;

    public void  setName(String name) {
        this.name = name;}

    public void setId(int id) {
        this.id = id;}

    public void setEmail(String email) {

        this.email = email;
    }

    public String getName() {

        return this.name;
    }
    public int getId() {

        return this.id;
    }
    public String getEmail() {

        return this.email;
    }


    public static void main(String[] args) {

        Encapsulation kullanici=new Encapsulation();
        kullanici.setName("Ahmet");
        kullanici.setId(1);
        kullanici.setEmail(kullanici.getName()+"@İşgmail.com");
        System.out.println(kullanici.getName());
        System.out.println(kullanici.getId());
        System.out.println(kullanici.getEmail());

    }























}
