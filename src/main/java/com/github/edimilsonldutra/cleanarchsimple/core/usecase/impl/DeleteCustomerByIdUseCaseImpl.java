package com.github.edimilsonldutra.cleanarchsimple.core.usecase.impl;

import com.github.edimilsonldutra.cleanarchsimple.core.dataprovider.DeleteCustomerById;
import com.github.edimilsonldutra.cleanarchsimple.core.usecase.DeleteCustomerByIdUseCase;
import com.github.edimilsonldutra.cleanarchsimple.core.usecase.FindCustomerByIdUseCase;

public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerByIdUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    private final DeleteCustomerById deleteCustomer;

    public DeleteCustomerByIdUseCaseImpl(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerById deleteCustomer
    ) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.deleteCustomer = deleteCustomer;
    }
    @Override
    public void delete(String id) {
        findCustomerByIdUseCase.find(id);
        deleteCustomer.delete(id);

    }
}
