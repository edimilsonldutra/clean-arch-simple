package com.github.edimilsonldutra.cleanarchsimple.core.dataprovider;

import com.github.edimilsonldutra.cleanarchsimple.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {
    Optional<Customer> find(final String id);
}

