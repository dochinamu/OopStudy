
public class hw7_2 {

    public static void main(String[] args) {

        Car regularCar = new Car("Toyota", "Camry");
        Car electricCar = new ElectricCar("Tesla", "Model S", 20);

        regularCar.info();
        electricCar.info();

    }

}

class Car {
    protected String brand;
    protected String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void genericInfo() {
        System.out.println("This is a car");
    }

    public void info() {
        genericInfo();
        System.out.println(toString());
    }

    public String toString() {
        return "[CAR] brand(" + brand + ") model(" + model + ")";
    }

}

class ElectricCar extends Car {
    private int batteryLife;

    public ElectricCar(String brand, String model, int batteryLife) {
        super(brand, model);
        this.batteryLife = batteryLife;
    }

    public void genericInfo() {
        System.out.println("This is an electric car.");
    }

    public String toString() {
        return "[ELECTRIC CAR] brand(" + brand + ") model(" + model +
                ") batteryLife(" + batteryLife + ")";
    }

}

