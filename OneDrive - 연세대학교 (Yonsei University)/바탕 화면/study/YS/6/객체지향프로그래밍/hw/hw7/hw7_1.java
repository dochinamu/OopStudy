public class hw7_1 {
    public static void main(String[] args) {
        Animal[] cage  = new Animal[3];
        cage[0] = new Dog("Buddy", "Golden Retriever");
        cage[1] = new Cat("Whiskers", "White");
        cage[2] = new Bird("Tweety", true);

        for (int i=0; i<cage.length; i++) {
            cage[i].sound();
        }

    }
}

abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void sound();

}

class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }
    public void sound() {
        System.out.println(super.getName() + " says: Woof! Woof!");
    }
}

class Cat extends Animal {
    private String color;
    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }
    public void sound() {
        System.out.println(super.getName() + " says: Meow! Meow!");
    }
}

class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    public void sound() {
        System.out.println(super.getName() + " says: Chirp! Chirp!");
    }
}