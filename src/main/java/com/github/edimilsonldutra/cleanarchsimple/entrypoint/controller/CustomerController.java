package com.github.edimilsonldutra.cleanarchsimple.entrypoint.controller;

import com.github.edimilsonldutra.cleanarchsimple.core.usecase.InsertCustomerUseCase;
import com.github.edimilsonldutra.cleanarchsimple.entrypoint.controller.mapper.CustomerMapper;
import com.github.edimilsonldutra.cleanarchsimple.entrypoint.controller.request.CustomerResquest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private InsertCustomerUseCase insertCustomerUseCase;

    private CustomerMapper customerMapper;
    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerResquest customerResquest) {
        var customer = customerMapper.toCustomer(customerResquest);
        insertCustomerUseCase.insert(customer, customerResquest.getZipCode());
        return ResponseEntity.ok().build();
    }
}
