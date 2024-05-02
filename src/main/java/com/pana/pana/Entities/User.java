package com.pana.pana.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Order> invoices;

}
