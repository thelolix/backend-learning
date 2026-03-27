interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Hav hav");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Miyav Miyav");
    }
}
class maymun implements Animal {
    @Override
    public void sound() {
        System.out.println("hua hua");
    }
}

public class interface1 {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();
        Animal m = new maymun();
        d.sound();
        c.sound();
        m.sound();
    }
}
