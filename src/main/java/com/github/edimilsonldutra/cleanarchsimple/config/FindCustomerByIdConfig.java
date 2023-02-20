package com.github.edimilsonldutra.cleanarchsimple.config;

import com.github.edimilsonldutra.cleanarchsimple.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.github.edimilsonldutra.cleanarchsimple.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase (
            FindCustomerByIdImpl findCustomerById
    ) {
        return new FindCustomerByIdUseCaseImpl((findCustomerById));
    }
}
