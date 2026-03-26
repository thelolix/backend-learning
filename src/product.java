public class product{
    /*int id;
    String name;
    double price;


    product(int id, String name, double price) {
        this.id = id;
        this.name=name;
        this.price=price;}

    void Ürünbilgileri(){
        System.out.println("İD: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);}

    public static void main(String[] args) {
        product ürün1 = new product(1,"Pantolon",1231);
        product ürün2=new product(2,"Phone",2000);
        product ürün3 = new product(3,"Tablet",3000);

        ürün1.Ürünbilgileri();
        ürün2.Ürünbilgileri();
        ürün3.Ürünbilgileri();
    }*/


        private  int id;
        private String name;
        private int price;

        public void setName(String name){
            this.name=name;}
        public String getName(){
            return this.name;
        }
        public static void main(String[] args) {
            product ürün1=new product();
            ürün1.setName("Mustafa");
            System.out.println(ürün1.getName());
    }

}