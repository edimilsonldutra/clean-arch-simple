package com.github.edimilsonldutra.cleanarchsimple.config;

import com.github.edimilsonldutra.cleanarchsimple.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.github.edimilsonldutra.cleanarchsimple.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.github.edimilsonldutra.cleanarchsimple.dataprovider.FindAddressByZipCodeImpl;
import com.github.edimilsonldutra.cleanarchsimple.dataprovider.updateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase (
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            FindAddressByZipCodeImpl findAddressByZipCode,
            updateCustomerImpl updateCustomer
    ) {
        return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase, findAddressByZipCode, updateCustomer);
    }

}
