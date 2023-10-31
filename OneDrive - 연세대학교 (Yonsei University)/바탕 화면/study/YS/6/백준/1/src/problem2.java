import java.util.Scanner;

public class problem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quarter, dime, nickel, penny;

        int loop_num = scanner.nextInt();
        String result, total = "";

        for (int i = 0; i < loop_num; i++) {
            int cent = scanner.nextInt();

            quarter = cent / 25;
            cent = cent % 25;

            dime = cent / 10;
            cent = cent % 10;

            nickel = cent / 5;
            penny = cent % 5;

            result = quarter + " " + dime + " " + nickel + " " + penny + "\n";
            total += result;
        }
        System.out.println(total);

    }
}