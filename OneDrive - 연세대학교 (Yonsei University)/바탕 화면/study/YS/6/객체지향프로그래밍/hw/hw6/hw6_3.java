public class hw6_3 {
    public static void main(String[] args) {
        Bird bird1 = new Bird("Sparrow", 0.025, 15);
        Bird bird2 = new Bird("Sparrow", 0.025, 15);
        Mammal mammal1 = new Mammal("Cat", 4.5, "Black");
        Mammal mammal2 = new Mammal("Cat", 4.5, "Gray");

        System.out.println(bird1);
        System.out.println(bird2);
        System.out.println("bird1 == bird2 ? " + bird1.equals(bird2));

        System.out.println(mammal1);
        System.out.println(mammal2);
        System.out.println("mamml1 == mammal2 ? " + mammal1.equals(mammal2));

        System.out.println("bird1 == mammal1 ? " + bird1.equals(mammal1));

    }
}

class Animal {
    protected String name;
    protected double weight;

    public Animal() {}
    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return "[Animal] name(" + name + ") weight(" + weight + ")";
    }

    public boolean equals(Object otherObject) {
        if (otherObject == null) return false;
        else if(getClass() != otherObject.getClass()) {
            return false;
        }
        else {
            Animal otherAnimal= (Animal) otherObject;
            return (name.equals(otherAnimal.name) && (weight == otherAnimal.weight));
        }
    }
}

class Bird extends Animal {
    protected int wingSpan;

    public Bird(String name, double weight, int wingSpan){
        super(name, weight);
        this.wingSpan = wingSpan;
    }

    public String toString() {
        return "[Bird] wingSpan(" + wingSpan + ") " + super.toString();
    }

    public boolean equals(Object otherObject) {
        if (!(otherObject instanceof Bird))
            return false;
        Bird otherMammal = (Bird) otherObject;
        return super.equals(otherObject) && this.wingSpan == otherMammal.wingSpan;
    }
}
class Mammal extends Animal{
    protected String furColor;

    public Mammal(String name, double weight, String furColor) {
        super(name, weight);
        this.furColor = furColor;
    }

    public String toString() {
        return "[Mammal] furColor(" + furColor + ") " + super.toString();
    }

    public boolean equals(Object otherObject) {
        if (!(otherObject instanceof Mammal)) {
            return false;
        }
        Mammal otherMammal = (Mammal) otherObject;
        return super.equals(otherObject) && this.furColor.equals(otherMammal.furColor);

    }


}
