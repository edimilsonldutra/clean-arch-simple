package com.github.edimilsonldutra.cleanarchsimple.core.usecase;

import com.github.edimilsonldutra.cleanarchsimple.core.domain.Customer;

public interface FindCustomerByIdUseCase {
    Customer find(final String id);
}
