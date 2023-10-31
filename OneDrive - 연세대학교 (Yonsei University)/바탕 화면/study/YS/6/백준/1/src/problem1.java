import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cnt = n / 4;
        for (int i = 0; i < cnt; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
