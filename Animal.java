// Animal.java
public class Animal {
    String name;
    int age;

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            makeSound();
        }
    }

    public void eat(String foodType) {
        System.out.println("Animal eats " + foodType);
    }
}
