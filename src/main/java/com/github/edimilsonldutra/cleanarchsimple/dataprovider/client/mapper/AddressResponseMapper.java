package com.github.edimilsonldutra.cleanarchsimple.dataprovider.client.mapper;

import com.github.edimilsonldutra.cleanarchsimple.core.domain.Address;
import com.github.edimilsonldutra.cleanarchsimple.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);

}
