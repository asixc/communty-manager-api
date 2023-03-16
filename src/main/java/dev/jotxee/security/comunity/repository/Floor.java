package dev.jotxee.security.comunity.repository;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "floors")
public class Floor {

    @Id
    @GeneratedValue
    private Integer Id;

    private int height;

    private String description;

    @OneToMany(mappedBy = "floor")
    private Set<Payment> payments;

}
