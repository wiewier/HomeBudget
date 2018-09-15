package pl.mwosz.homebudget.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Expense_Category")
public class ExpenseCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime creationDateTime;
    private String category;
    private boolean deleted;

    public ExpenseCategory() {
    }

    public ExpenseCategory(LocalDateTime creationDateTime, String category, boolean deleted) {
        this.creationDateTime = creationDateTime;
        this.category = category;
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "ExpenseCategory{" +
                "id=" + id +
                ", creationDateTime=" + creationDateTime +
                ", category='" + category + '\'' +
                ", deleted=" + deleted +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
