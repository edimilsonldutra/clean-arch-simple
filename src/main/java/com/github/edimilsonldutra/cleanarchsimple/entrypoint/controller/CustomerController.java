package com.github.edimilsonldutra.cleanarchsimple.entrypoint.controller;

import com.github.edimilsonldutra.cleanarchsimple.core.usecase.DeleteCustomerByIdUseCase;
import com.github.edimilsonldutra.cleanarchsimple.core.usecase.FindCustomerByIdUseCase;
import com.github.edimilsonldutra.cleanarchsimple.core.usecase.InsertCustomerUseCase;
import com.github.edimilsonldutra.cleanarchsimple.core.usecase.UpdateCustomerUseCase;
import com.github.edimilsonldutra.cleanarchsimple.entrypoint.controller.mapper.CustomerMapper;
import com.github.edimilsonldutra.cleanarchsimple.entrypoint.controller.request.CustomerResquest;
import com.github.edimilsonldutra.cleanarchsimple.entrypoint.controller.response.CustomerResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private InsertCustomerUseCase insertCustomerUseCase;
    private FindCustomerByIdUseCase findCustomerByIdUseCase;
    private CustomerMapper customerMapper;
    private UpdateCustomerUseCase updateCustomerUseCase;

    private DeleteCustomerByIdUseCase deleteCustomerByIdUseCase;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerResquest customerResquest) {
        var customer = customerMapper.toCustomer(customerResquest);
        insertCustomerUseCase.insert(customer, customerResquest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id) {
        var customer = findCustomerByIdUseCase.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final String id,
                                       @Valid @RequestBody CustomerResquest customerResquest) {
        var customer = customerMapper.toCustomer(customerResquest);
        customer.setId(id);
        updateCustomerUseCase.update(customer, customerResquest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final String id) {
        deleteCustomerByIdUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }
}
