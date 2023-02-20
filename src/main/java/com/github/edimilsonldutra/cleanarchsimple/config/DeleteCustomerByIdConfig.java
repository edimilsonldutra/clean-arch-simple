package com.github.edimilsonldutra.cleanarchsimple.config;

import com.github.edimilsonldutra.cleanarchsimple.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import com.github.edimilsonldutra.cleanarchsimple.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.github.edimilsonldutra.cleanarchsimple.dataprovider.DeleteCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            DeleteCustomerByIdImpl deleteCustomerById
    ) {
        return new DeleteCustomerByIdUseCaseImpl(findCustomerByIdUseCase, deleteCustomerById);
    }
}
