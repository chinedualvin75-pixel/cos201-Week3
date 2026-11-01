
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter first score: ");
        double score1 = input.nextDouble();

        System.out.print("Enter second score: ");
        double score2 = input.nextDouble();

        System.out.print("Enter third score: ");
        double score3 = input.nextDouble();

        double total = score1 + score2 + score3;
        double average = total / 3.0;

        System.out.println("Student name: " + name);
        System.out.println("Total score: " + total);
        System.out.println("Average score: " + average);

        input.close();
    }
}
