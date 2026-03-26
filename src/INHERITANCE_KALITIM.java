class person{
    String name;
    int age;
    void showInfo(){
        System.out.println("İsim: " + name);
        System.out.println("Yaş: " + age);}
}
class Student extends person{
    int studentNumber;

}

public class INHERITANCE_KALITIM  {
    public static void main(String[] args) {
        Student kullanıcı = new Student();
        kullanıcı.name="Mustafa Talha Yılmaz";
        kullanıcı.age=22;
        kullanıcı.studentNumber=42;
        kullanıcı.showInfo();
        System.out.println("Numarası: " +kullanıcı.studentNumber);
    }
}
