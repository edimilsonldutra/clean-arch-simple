package com.github.edimilsonldutra.cleanarchsimple.core.usecase;

import com.github.edimilsonldutra.cleanarchsimple.core.domain.Customer;

public interface UpdateCustomerUseCase {
    void update(Customer customer, String zipCode);

}
