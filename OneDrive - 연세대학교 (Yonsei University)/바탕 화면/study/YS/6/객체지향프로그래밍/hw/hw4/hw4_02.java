public class hw4_02 {

    public static void main(String[] args) {

        Date date1 = new Date(10, 7);        // July 10th
        Person person1 = new Person(date1);  // date1 as birthDate of person1

        System.out.println("person1's birthDate: " + person1.getBirthDate());

        // using getBirthDate()
        Date date2 = person1.getBirthDate();  // get person1's date into date2
        date2.setDay(20); // Modifying the day of the date2

        Person person2 = new Person(date2);  // date2 as birthDate of person2

        System.out.println("person1's birthDate: " + person1.getBirthDate());
        System.out.println("person2's birthDate: " + person2.getBirthDate());

        System.out.println();

        date1 = new Date(10, 7);        // July 10th again
        person1 = new Person(date1);    // date1 as birthDate of person1 again

        System.out.println("person1's birthDate: " + person1.getBirthDate());

        // using getBirthDate2()
        date2 = person1.getBirthDate2();  // get person1's date into date2
        date2.setDay(20); // Modifying the day of the date2

        person2 = new Person(date2);  // date2 as birthDate of person2

        System.out.println("person1's birthDate: " + person1.getBirthDate());
        System.out.println("person2's birthDate: " + person2.getBirthDate());

    }
}

class Date {
    private int day;
    private int month;

    public Date() {
        day = 1;
        month = 1;
    }

    public Date(int day, int month) {
        this.day = day;
        this.month = month;
    }
    public Date(Date aDate) {
        if (aDate == null) {
            System.out.println("Error");
            System.exit(0);
        }

        this.day = aDate.day;
        this.month = aDate.month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toString() {
        return day + "/" + month;
    }

}

class Person {
    Date birthdate;

    public Person(){}

    public Person(Date birthdate) {
        if (birthdate == null) {
            System.exit(0);
        }
        this.birthdate = new Date(birthdate);
    }

    public Date getBirthDate() {
        return birthdate;
    }
    public Date getBirthDate2() {
        return new Date(birthdate);
    }

}

