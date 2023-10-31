import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        String word1, word2;

        System.out.println("Enter a line of text: ");

        word1 = keyboard1.next();
        word2 = keyboard1.next();
        System.out.println("For keyboard1 the two words read are:");
        System.out.println(word1);
        System.out.println(word2);

        String junk = keyboard1.nextLine();

        System.out.println("Reenter the same line of text: ");
        word1 = keyboard1.next();
        word2 = keyboard1.next();
        System.out.println("For keyboard1-2 the two words read are:");
        System.out.println(word1);
        System.out.println(word2);

    }
}
