package com.github.edimilsonldutra.cleanarchsimple.core.usecase;

import com.github.edimilsonldutra.cleanarchsimple.core.domain.Customer;

public interface InsertCustomerUseCase {
    void insert(Customer customer, String zipCode);
}
