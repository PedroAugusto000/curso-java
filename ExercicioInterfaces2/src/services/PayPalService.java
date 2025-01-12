package services;

public class PayPalService implements OnlinePaymentService {

    private static final double INTEREST_RATE = 0.015; // 1.5%
    private static final double PAYMENT_FEE = 0.03;   // 3%

    @Override
    public double interest(double amount, int month) {
        return amount * INTEREST_RATE * month;
    }

    @Override
    public double paymentFee(double amount) {
        return amount * PAYMENT_FEE;
    }
}
