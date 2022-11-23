package com.food.ordering.system.order.service.domain.ports.output.repository;

import com.food.ordering.system.domain.valueobject.CustomerId;
import com.food.ordering.system.order.service.domain.entity.Customer;

import java.util.Optional;

public interface CustomerRepository {

    Optional<Customer> findCustomer(CustomerId customerId);
}
