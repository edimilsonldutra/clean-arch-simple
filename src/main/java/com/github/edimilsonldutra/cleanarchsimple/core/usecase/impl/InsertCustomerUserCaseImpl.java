package com.github.edimilsonldutra.cleanarchsimple.core.usecase.impl;

import com.github.edimilsonldutra.cleanarchsimple.core.dataprovider.FindAddresByZipCode;
import com.github.edimilsonldutra.cleanarchsimple.core.dataprovider.InsertCustomer;
import com.github.edimilsonldutra.cleanarchsimple.core.dataprovider.SendCpfForValidation;
import com.github.edimilsonldutra.cleanarchsimple.core.domain.Customer;
import com.github.edimilsonldutra.cleanarchsimple.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUserCaseImpl implements InsertCustomerUseCase {

    private final FindAddresByZipCode findAddresByZipCode;
    private final InsertCustomer insertCustomer;
    private final SendCpfForValidation sendCpfForValidation;

    public InsertCustomerUserCaseImpl(
            FindAddresByZipCode findAddresByZipCode,
            InsertCustomer insertCustomer,
            SendCpfForValidation sendCpfForValidation
    ) {
        this.findAddresByZipCode = findAddresByZipCode;
        this.insertCustomer = insertCustomer;
        this.sendCpfForValidation = sendCpfForValidation;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddresByZipCode.find(zipCode);
        customer.setAddress(address);
        insertCustomer.insert(customer);
        sendCpfForValidation.send(customer.getCpf());
    }
}
