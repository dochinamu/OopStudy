public class hw7_3 {
    public static void main(String[] args) {
        Player footballer = new FootballPlayer("Lionel Messi", "Forward", "male");
        Player basketballer = new BasketballPlayer("LeBron James", "Forward", 38);

        footballer.info();
        basketballer.info();

    }
}

abstract class Player{
    private String name;
    private String position;

    public String getName() {
        return this.name;
    }
    public String getPosition() {
        return this.position;
    }
    public Player(String name, String position) {
        this.name = name;
        this.position = position;
    }

    abstract void info();
}

class FootballPlayer extends Player{
    private String gender;

    public FootballPlayer(String name, String position, String gender) {
        super(name, position);
        this.gender = gender;
    }

    public void info() {
        System.out.println("Football Player: " + super.getName() + ", Position: " + super.getPosition() + ", Gender: " + gender);
    }

}


class BasketballPlayer extends Player{
    private int age;
    public BasketballPlayer(String name, String position, int age) {
        super(name, position);
        this.age = age;
    }

    public void info() {
        System.out.println("Basketball Player: " + super.getName() + ", Position: " + super.getPosition() + ", Age: " + age);
    }
}