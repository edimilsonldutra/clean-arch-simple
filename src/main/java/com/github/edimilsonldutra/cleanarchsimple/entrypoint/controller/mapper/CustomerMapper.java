package com.github.edimilsonldutra.cleanarchsimple.entrypoint.controller.mapper;

import com.github.edimilsonldutra.cleanarchsimple.core.domain.Customer;
import com.github.edimilsonldutra.cleanarchsimple.entrypoint.controller.request.CustomerResquest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerResquest customerResquest);
}
