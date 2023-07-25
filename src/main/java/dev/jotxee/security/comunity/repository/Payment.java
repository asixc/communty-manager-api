package dev.jotxee.security.comunity.repository;

import dev.jotxee.security.user.User;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.UUID;

@Data
@Entity
@Table(name = "payments")
public class Payment implements Serializable {
    @Id
    @GeneratedValue // @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private LocalDateTime created;

    private LocalDateTime updated;

    @Column(name = "month_paid")
    private YearMonth monthPaid;

    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "floor_id")
    private Floor floor;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @PrePersist
    public void prePersist() {
        created = LocalDateTime.now();
        updated = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        updated = LocalDateTime.now();
    }

}
