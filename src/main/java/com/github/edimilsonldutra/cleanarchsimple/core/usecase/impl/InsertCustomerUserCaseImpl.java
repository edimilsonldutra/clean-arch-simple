package com.github.edimilsonldutra.cleanarchsimple.core.usecase.impl;

import com.github.edimilsonldutra.cleanarchsimple.core.dataprovider.FindAddresByZipCode;
import com.github.edimilsonldutra.cleanarchsimple.core.dataprovider.InsertCustomer;
import com.github.edimilsonldutra.cleanarchsimple.core.domain.Customer;
import com.github.edimilsonldutra.cleanarchsimple.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUserCaseImpl implements InsertCustomerUseCase {

    private FindAddresByZipCode findAddresByZipCode;

    private InsertCustomer insertCustomer;

    public InsertCustomerUserCaseImpl(
            FindAddresByZipCode findAddresByZipCode,
            InsertCustomer insertCustomer
    ) {
        this.findAddresByZipCode = findAddresByZipCode;
        this.insertCustomer = insertCustomer;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddresByZipCode.find(zipCode);
        customer.setAddress(address);
        insertCustomer.insert(customer);
    }
}
