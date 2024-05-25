// Zoo.java
public class Zoo {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Elephant elephant = new Elephant();
        Monkey monkey = new Monkey();

        lion.makeSound();
        lion.eat();
        lion.makeSound(3);
        lion.eat("steak");

        elephant.makeSound();
        elephant.eat();
        elephant.makeSound(2);
        elephant.eat("hay");

        monkey.makeSound();
        monkey.eat();
        monkey.makeSound(4);
        monkey.eat("fruit");
    }
}
