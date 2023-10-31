public class hw3_02 {
    public static void main(String[] args) {
        Temperature myTemp1 = new Temperature(32.0);  // creating a temperature with Fahrenheit 32.0
        System.out.println(myTemp1);

        Temperature myTemp2 = new Temperature(32.0, 0.0);  // creating a temperature with 32.0F and 0.0C
        myTemp2.setTemperature(100.0, true);  // setting the temperature in Celsius 100.0
        System.out.println(myTemp2);

        System.out.println("myTemp1 == myTemp2 ? " + myTemp1.equals(myTemp2));
    }
}


class Temperature {
    private double fahrenheit;
    private double celsius;
    private double kelvin;

    public Temperature (double fahrenheit) {
        this.fahrenheit = fahrenheit;
        this.celsius = (fahrenheit - 32) * 5 / 9;
        this.kelvin = celsius + 273.15;
    };

    public Temperature (double fahrenheit, double celsius) {
        this.fahrenheit = fahrenheit;
        this.celsius = celsius;
        this.kelvin = celsius + 273.15;
    };
    public boolean equals(Temperature other) {
        return this.fahrenheit == other.fahrenheit;
    }

    public void setTemperature(double celsius, boolean isCelsius) {
        if (isCelsius) {
            this.celsius = celsius;
            this.fahrenheit = celsius * 9 / 5 + 32;
            this.kelvin = celsius + 273.15;
        } else {
            this.fahrenheit = celsius;
            this.celsius = (fahrenheit - 32) * 5 / 9;
            this.kelvin = celsius + 273.15;
        }
    }

    @Override
    public String toString() {
        return ("Fahrenheit: " + fahrenheit + ", Celsius: " + celsius + ", Kelvin: " + kelvin);
    }
}


