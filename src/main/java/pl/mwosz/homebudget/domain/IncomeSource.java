package pl.mwosz.homebudget.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Incom_Source")
public class IncomeSource {

    private Long id;
    private LocalDateTime creationDateTime;
    private String incomeName;
    private boolean deleted;

    public IncomeSource() {
    }

    public IncomeSource(Long id, LocalDateTime creationDateTime, String incomeName, boolean deleted) {
        this.id = id;
        this.creationDateTime = creationDateTime;
        this.incomeName = incomeName;
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "IncomeSource{" +
                "id=" + id +
                ", creationDateTime=" + creationDateTime +
                ", incomeName='" + incomeName + '\'' +
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

    public String getIncomeName() {
        return incomeName;
    }

    public void setIncomeName(String incomeName) {
        this.incomeName = incomeName;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
