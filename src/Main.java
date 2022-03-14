public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int monthlyAnnuityPayment12 = service.calculate(1_000_000, 12);
        System.out.println(monthlyAnnuityPayment12 + "  Рублей. Кредит на 12 месяцев, ежемесячный аннуитетный платеж.");
        int monthlyAnnuityPayment24 = service.calculate(1_000_000, 24);
        System.out.println(monthlyAnnuityPayment24 + "  Рублей. Кредит на 24 месяца, ежемесячный аннуитетный платеж.");
        int monthlyAnnuityPayment36 = service.calculate(1_000_000, 36);
        System.out.println(monthlyAnnuityPayment36 + "  Рублей. Кредит на 36 месяцев, ежемесячный аннуитетный платеж.");
    }
}


