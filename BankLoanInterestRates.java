import java.util.Scanner;

public class BankLoanInterestRates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double range;
        System.out.println("Enter loans: ");
        double loans = input.nextDouble();
        System.out.println("Enter intersest rates: ");
        double interestRates = input.nextDouble();
        System.out.println("Enter month: ");
        double months = input.nextDouble();

        double capital = loans / months;
        System.out.println("Principal pay in " + months + " months: " + capital);

        range = 0;
        double firstYearInterest = calculatorIterest(loans, interestRates, range);
        if (months <= 12) {
            System.out.println("First year interest: " + firstYearInterest);
            System.out.println("Monthly amount paid in first year: " + (capital + firstYearInterest));
        } else {
            System.out.println("Enter range next year: ");
            range = input.nextDouble();
            double nextYearInterest = calculatorIterest(loans,interestRates,range);
            System.out.println("Next year interest: " + nextYearInterest);
            System.out.println("Monthly amount paid in the first year: " + (capital + firstYearInterest));
            System.out.println("Monthly amount paid in the next year: " + (capital + nextYearInterest));
        }

    }

    public static double calculatorIterest(double loans, double interestRates, double range){
        return loans * ((interestRates + range) / 12);
    }
}
