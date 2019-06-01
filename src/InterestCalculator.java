import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        System.out.println("Money (million VND): ");
        money = scanner.nextDouble();
        System.out.println("Time (month): ");
        month = scanner.nextInt();
        System.out.println("Interest rate (%/year): ");
        interset_rate = scanner.nextDouble();
        double totalInterest = 0;
        totalInterest = money * interset_rate / 100 / 12 * month;
        System.out.println("Total interest is "+totalInterest+" million VND");
    }
}
