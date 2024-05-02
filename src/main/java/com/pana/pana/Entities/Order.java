package com.pana.pana.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "order")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Order {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private Order_State state;
    private Integer amount;
    private LocalDate date;

    @ManyToOne @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany @JoinTable(
        name = "order_product",
        joinColumns = @JoinColumn(name = "order_id"),
        inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;

    @OneToOne(mappedBy = "order")
    private Payment payment;

}
