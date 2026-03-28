class Vehicle {
    private String brand;
    private int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    void move() {
        System.out.println("Araç hareket ediyor");
    }
}

class Car1 extends Vehicle {
    Car1(String brand, int speed) {
        super(brand, speed); // üst sınıfın constructor'unu çağırıyoruz
    }

    @Override
    void move() {
        System.out.println("Araba gidiyor");
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void move() {
        System.out.println("Motor gidiyor");
    }
}

public class Method_Override {
    public static void main(String[] args) {
        Vehicle v1 = new Car1("Toyota", 120);
        Vehicle v2 = new Motorcycle("Honda", 100);

        v1.move(); // Araba gidiyor
        v2.move(); // Motor gidiyor

        System.out.println(v1.getBrand() + " hızı: " + v1.getSpeed());
        System.out.println(v2.getBrand() + " hızı: " + v2.getSpeed());
    }
}
