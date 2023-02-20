package com.github.edimilsonldutra.cleanarchsimple.dataprovider;

import com.github.edimilsonldutra.cleanarchsimple.core.dataprovider.DeleteCustomerById;
import com.github.edimilsonldutra.cleanarchsimple.dataprovider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdImpl implements DeleteCustomerById {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
