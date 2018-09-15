package pl.mwosz.homebudget.domain;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Income {

    private Long id;
    private BigDecimal incomeAmount;
    private IncomeSource incomeSource;
    private String title;
    private LocalDateTime creationDayTime;  // data tworzenia rekordu
    private LocalDate incomeDate;           // data jakiego okresu dotyczy
    private boolean deleted;

    public Income() {
    }

    public Income(BigDecimal incomeAmount, IncomeSource incomeSource, String title, LocalDateTime creationDayTime, LocalDate incomeDate, boolean deleted) {
        this.incomeAmount = incomeAmount;
        this.incomeSource = incomeSource;
        this.title = title;
        this.creationDayTime = creationDayTime;
        this.incomeDate = incomeDate;
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Income{" +
                "id=" + id +
                ", incomeAmount=" + incomeAmount +
                ", incomeSource=" + incomeSource +
                ", title='" + title + '\'' +
                ", creationDayTime=" + creationDayTime +
                ", incomeDate=" + incomeDate +
                ", deleted=" + deleted +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getIncomeAmount() {
        return incomeAmount;
    }

    public void setIncomeAmount(BigDecimal incomeAmount) {
        this.incomeAmount = incomeAmount;
    }

    public IncomeSource getIncomeSource() {
        return incomeSource;
    }

    public void setIncomeSource(IncomeSource incomeSource) {
        this.incomeSource = incomeSource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getCreationDayTime() {
        return creationDayTime;
    }

    public void setCreationDayTime(LocalDateTime creationDayTime) {
        this.creationDayTime = creationDayTime;
    }

    public LocalDate getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(LocalDate incomeDate) {
        this.incomeDate = incomeDate;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
