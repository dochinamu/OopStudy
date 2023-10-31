public class hw5_4 {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory(4);

        Car car1 = new Car(CarModel.SEDAN);
        Car car2 = new Car(CarModel.SUV);
        Car car3 = new Car(CarModel.HATCHBACK);
        Car car4 = new Car(CarModel.PICKUP);

        factory.addCar(car1);
        factory.addCar(car2);
        factory.addCar(car3);
        factory.addCar(car4);

        // Print out all cars in the inventory
        Car[] inventory = factory.getInventory();
        for (int i = 0; i < inventory.length; i++) {
            System.out.println(inventory[i]);
        }

        // Retrieve a specific car by its model
        Car specificCar = factory.getCarByModel("SUV");
        System.out.println("Specific Car: " + specificCar);

        specificCar = factory.getCarByModel("PICKUP");
        System.out.println("Specific Car: " + specificCar);

    }

}
enum CarModel {SEDAN, SUV, HATCHBACK, PICKUP}
class Car{
    private CarModel model;

    public Car() {}

    public Car(Car otherCar) {
        if (otherCar == null) {
            System.exit(0);
        }
        this.model = otherCar.model;
    }
    public Car(CarModel model) {
        this.model = model;
    }

    public CarModel getModel() {
        return this.model;
    }

    public String toString() {
        return "Car Model: " + this.model;
    }
}

class CarFactory {
    private Car[] inventory;
    private int carCount;


    public CarFactory() {}

    public CarFactory(int capacity) {
        this.inventory = new Car[capacity];
        this.carCount = 0;
    }
    public void addCar(Car car) {
        if (carCount < inventory.length) {
            inventory[carCount] = car;
            carCount++;
        }

    }

    public Car[] getInventory() {
       Car[] temp = new Car[carCount];
       for (int i =0; i< carCount; i++) {
           if (inventory[i] != null) {
               temp[i] = new Car(inventory[i]);
           }
       }
       return temp;
    }

    public Car getCarByModel(String model) {
        for (int i=0; i<carCount; i++) {
            if (inventory[i].getModel().toString().equals(model)) {
                return new Car(inventory[i]);
            }
        }
        return null;
    }
}

