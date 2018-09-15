package pl.mwosz.homebudget.domain;

import org.hibernate.type.LocalDateType;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Expense {

    private Long id;
    @Column(nullable = false)
    private String expenseTitle;
    private String expansePlace;
    @Column(nullable = false)
    private BigDecimal expenseAmount;
    private LocalDate expenseDate;
    private LocalDateTime creationDateTime;
    private ExpenseCategory category;
    private boolean deleted;
    private PaymentMethod paymentMethod;

    public Expense() {
    }

    public Expense(Long id, String expenseTitle, String expansePlace, BigDecimal expenseAmount, LocalDate expenseDate, LocalDateTime creationDateTime, ExpenseCategory category, boolean deleted, PaymentMethod paymentMethod) {
        this.id = id;
        this.expenseTitle = expenseTitle;
        this.expansePlace = expansePlace;
        this.expenseAmount = expenseAmount;
        this.expenseDate = expenseDate;
        this.creationDateTime = creationDateTime;
        this.category = category;
        this.deleted = deleted;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", expenseTitle='" + expenseTitle + '\'' +
                ", expansePlace='" + expansePlace + '\'' +
                ", expenseAmount=" + expenseAmount +
                ", expenseDate=" + expenseDate +
                ", creationDateTime=" + creationDateTime +
                ", category=" + category +
                ", deleted=" + deleted +
                ", paymentMethod=" + paymentMethod +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExpenseTitle() {
        return expenseTitle;
    }

    public void setExpenseTitle(String expenseTitle) {
        this.expenseTitle = expenseTitle;
    }

    public String getExpansePlace() {
        return expansePlace;
    }

    public void setExpansePlace(String expansePlace) {
        this.expansePlace = expansePlace;
    }

    public BigDecimal getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(BigDecimal expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public LocalDate getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(LocalDate expenseDate) {
        this.expenseDate = expenseDate;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public ExpenseCategory getCategory() {
        return category;
    }

    public void setCategory(ExpenseCategory category) {
        this.category = category;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
