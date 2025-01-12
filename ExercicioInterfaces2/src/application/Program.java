package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.StudentContract;
import entities.Installment;
import services.PaymentService;
import services.PayPalService;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("=== EMISSÃO DE BOLETO ===");

        System.out.print("Matrícula do aluno: ");
        int enrollmentId = sc.nextInt();
        System.out.print("Data de início do curso (dd/MM/yyyy): ");
        LocalDate startDate = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor total do curso: ");
        double totalValue = sc.nextDouble();

        StudentContract studentContract = new StudentContract(enrollmentId, startDate, totalValue);

        System.out.print("Número de parcelas: ");
        int n = sc.nextInt();

        PaymentService paymentService = new PaymentService(new PayPalService());
        paymentService.calculateInstallment(studentContract, n);

        System.out.println("=== PARCELAS ===");
        for (Installment installment : studentContract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
