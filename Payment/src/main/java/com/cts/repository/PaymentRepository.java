package com.cts.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.beans.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer>{
	Optional<Payment> findById(int cvv);

}
