/*
abstract class payment{
    double ödeme;
    payment(double ödeme){
        this.ödeme=ödeme;
    }
    abstract void pay();
}
class CreditCard extends payment {

    CreditCard(double ödeme){
        super(ödeme);}
    @Override
    void pay(){
        System.out.println("Kredi kartı ile ödeme: " + ödeme);
    }
}
class Bankatrans extends payment{
    Bankatrans(double ödeme){
        super(ödeme);}

    @Override
    void pay(){
        System.out.println("Havale ile ödeme: " + ödeme);
    }
}

public class ABSTRACT {
    public static void main(String[] args) {
        payment k1 = new CreditCard(123.456);
        payment k2 = new Bankatrans(789.123);

        k1.pay();
        k2.pay();
    }
}
*/
abstract class animal{
    int sayı;
    animal(int sayı){
        this.sayı=sayı;}
    abstract void result();
}

class Kara extends animal {
    Kara(int sayı) {
        super(sayı);}

    @Override
    void result() {
        System.out.println("Karada giden hayvan sayısı: " + sayı);

    }

}
class Deniz extends animal {
    Deniz(int sayı){
        super(sayı);
    }
    @Override
    void result() {
        System.out.println("Denizde giden hayvan sayısı: " + sayı);
    }
}

public class ABSTRACT{
    public static void main(String[] args) {
        animal k1 = new Kara(100);
        animal k2 = new Deniz(200);
        k1.result();
        k2.result();
    }
}