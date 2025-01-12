package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentContract {

    private Integer enrollmentId;
    private LocalDate startDate;
    private Double totalValue;

    private List<Installment> installments = new ArrayList<>();

    public StudentContract(Integer enrollmentId, LocalDate startDate, Double totalValue) {
        this.enrollmentId = enrollmentId;
        this.startDate = startDate;
        this.totalValue = totalValue;
    }

    public Integer getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(Integer enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public void addInstallment(Installment installment) {
        installments.add(installment);
    }
}
