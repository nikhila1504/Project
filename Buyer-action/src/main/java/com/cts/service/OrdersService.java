package com.cts.service;

import java.util.Optional;

import com.cts.entity.OrdersEntity;
import com.cts.model.Orders;



public interface OrdersService {
	Optional<Orders> findAllById(int orderId);

	Orders findById(int orderId);
	Iterable<OrdersEntity> findAll();
}
