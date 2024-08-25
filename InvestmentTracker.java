import java.util.Scanner;
public class InvestmentTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your buying price per share:");
        double buyingPrice = sc.nextDouble();
        int day = 1;
        double closingPrice;
        double weekly[] = new double[7];
        int i = 0;
        double earnings = 0;
        while (i < weekly.length) {
            System.out.println("Enter the closing price for day " + day + ":");
            closingPrice = sc.nextDouble();
            earnings = closingPrice - buyingPrice;
            weekly[i] = earnings;
            day++;
            i++;
        }
        System.out.println("After day " + day + ":");
        if (earnings > 0) {
            System.out.printf("You have gained Rs %.2f per share since the initial buying price.%n", earnings);
        } else if (earnings < 0) {
            System.out.printf("You have lost Rs %.2f per share since the initial buying price.%n", -earnings);
        } else {
            System.out.println("You have no earnings per share.");
        }
        System.out.println("Your weekly earnings:");
        double totalWeekEarnings = 0;
        for (int j = 0; j < weekly.length; j++) {
            System.out.printf("On day %d, your earning is Rs %.2f%n", (j + 1), weekly[j]);
            totalWeekEarnings += weekly[j];
        }
        System.out.printf("Total earnings for the week: Rs %.2f per share%n", totalWeekEarnings);
        sc.close();
    }
}