public class CreditPaymentService {
    public int calculate(double credit, double mount) {
        double interestRate = (float) 9.99;
        double loanRatePerMonth = interestRate / 12 / 100;
        double annuityRatio0 = (loanRatePerMonth * (Math.pow(1 + loanRatePerMonth, mount)));
        double annuityRatio1 = (Math.pow(1 + loanRatePerMonth, mount)) - 1;
        double annuityRatio = annuityRatio0 / annuityRatio1;
        Math.pow(1 + loanRatePerMonth, mount);
        double monthlyAnnuityPayment = annuityRatio * credit;
        return (int) monthlyAnnuityPayment;
    }
}

