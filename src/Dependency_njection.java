
public class Dependency_njection {
    public static void main(String[] args){
        Engine e = new Engine(1.5);
        Car car = new Car(e);
        car.drive();
    }
}