package services;

import java.time.LocalDate;

import entities.StudentContract;
import entities.Installment;

public class PaymentService {

    private OnlinePaymentService onlinePaymentService;

    public PaymentService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void calculateInstallment(StudentContract studentContract, int months) {
        double baseAmount = studentContract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = studentContract.getStartDate().plusMonths(i);
            double interest = onlinePaymentService.interest(baseAmount, i);
            double fee = onlinePaymentService.paymentFee(baseAmount + interest);
            double finalAmount = baseAmount + interest + fee;

            studentContract.addInstallment(new Installment(dueDate, finalAmount));
        }
    }
}
