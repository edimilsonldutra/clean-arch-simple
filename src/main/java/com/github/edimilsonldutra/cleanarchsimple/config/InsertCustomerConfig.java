package com.github.edimilsonldutra.cleanarchsimple.config;

import com.github.edimilsonldutra.cleanarchsimple.core.usecase.impl.InsertCustomerUserCaseImpl;
import com.github.edimilsonldutra.cleanarchsimple.dataprovider.FindAddressByZipCodeImpl;
import com.github.edimilsonldutra.cleanarchsimple.dataprovider.InsertCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUserCaseImpl insertCustomerUserCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer
    ) {
        return new InsertCustomerUserCaseImpl(findAddressByZipCode, insertCustomer);
    }

}
