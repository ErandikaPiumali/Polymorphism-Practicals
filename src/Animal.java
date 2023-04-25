public class Animal {
    void eat(){

    }
}
class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("Eat anything");
    }
}
class Lion extends Animal{
    @Override
    void eat() {
        System.out.println("Eat meat only");
    }
}
class TestCode {
    public static void main(String[] args) {
        Animal d= new Dog();
        Animal l = new Lion();
        d.eat();
        l.eat();
    }
}