package com.github.edimilsonldutra.cleanarchsimple.core.usecase.impl;

import com.github.edimilsonldutra.cleanarchsimple.core.dataprovider.FindAddresByZipCode;
import com.github.edimilsonldutra.cleanarchsimple.core.dataprovider.UpdateCustomer;
import com.github.edimilsonldutra.cleanarchsimple.core.domain.Customer;
import com.github.edimilsonldutra.cleanarchsimple.core.usecase.FindCustomerByIdUseCase;
import com.github.edimilsonldutra.cleanarchsimple.core.usecase.UpdateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;
    private final FindAddresByZipCode findAddresByZipCode;
    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseImpl(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddresByZipCode findAddresByZipCode,
            UpdateCustomer updateCustomer
            ) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddresByZipCode = findAddresByZipCode;
        this.updateCustomer = updateCustomer;
    }
    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdUseCase.find(customer.getId());
        var address = findAddresByZipCode.find(zipCode);
        customer.setAddress(address);
        updateCustomer.update(customer);
    }
}
