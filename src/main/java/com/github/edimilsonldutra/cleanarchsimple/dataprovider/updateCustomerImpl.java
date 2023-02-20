package com.github.edimilsonldutra.cleanarchsimple.dataprovider;

import com.github.edimilsonldutra.cleanarchsimple.core.dataprovider.UpdateCustomer;
import com.github.edimilsonldutra.cleanarchsimple.core.domain.Customer;
import com.github.edimilsonldutra.cleanarchsimple.dataprovider.repository.CustomerRepository;
import com.github.edimilsonldutra.cleanarchsimple.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class updateCustomerImpl implements UpdateCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
