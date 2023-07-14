public class Main {
    public static void main(String[] args) {
        CreditPaymentService service_1_year = new CreditPaymentService();
        int creditSum1 = 1_000_000;
        int years1 = 1;
        double yearPercent1 = 9.99;
        double monthPayment1 = service_1_year.calculate(creditSum1, years1, yearPercent1);
        System.out.println(Math.round(monthPayment1) + " ₽");

        CreditPaymentService service_2_years = new CreditPaymentService();
        int creditSum2 = 1_000_000;
        int years2 = 2;
        double yearPercent2 = 9.99;
        double monthPayment2 = service_2_years.calculate(creditSum2, years2, yearPercent2);
        System.out.println(Math.round(monthPayment2) + " ₽");

        CreditPaymentService service_3_years = new CreditPaymentService();
        int creditSum3 = 1_000_000;
        int years3 = 3;
        double yearPercent3 = 9.99;
        double monthPayment3 = service_3_years.calculate(creditSum3, years3, yearPercent3);
        System.out.println(Math.round(monthPayment3) + " ₽");
    }
}