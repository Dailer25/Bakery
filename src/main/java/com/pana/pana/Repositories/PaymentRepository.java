package com.pana.pana.Repositories;

import com.pana.pana.Entities.Payment;
import com.pana.pana.Entities.Payment_Method;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment findById(long id);
    Payment findByOrder(long id);
    Payment findByDate(LocalDate date);
    Payment findByPayment_method(Payment_Method payment_method);
}
