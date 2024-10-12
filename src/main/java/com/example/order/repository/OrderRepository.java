package com.example.order.repository;

import io.micrometer.observation.annotation.Observed;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.order.model.Order;

@Observed
public interface OrderRepository extends JpaRepository<Order, Long> {
}
