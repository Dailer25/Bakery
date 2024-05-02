package com.pana.pana.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "client")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Client {
    @Id
    private Long id;
    private String name;
    private String email;
    private Integer phone;

    @OneToMany(mappedBy = "client")
    private List<Order> invoices;

}
