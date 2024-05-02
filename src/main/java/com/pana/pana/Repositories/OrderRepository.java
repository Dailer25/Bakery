package com.pana.pana.Repositories;

import com.pana.pana.Entities.Order;
import com.pana.pana.Entities.Order_State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findById(long id);
    Order findByClient(long id);
    Order findByPayment(long id);
    Order findByDate(LocalDate date);
    Order findByState(Order_State state);
}
