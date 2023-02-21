package com.github.edimilsonldutra.cleanarchsimple.dataprovider;

import com.github.edimilsonldutra.cleanarchsimple.core.dataprovider.FindAddresByZipCode;
import com.github.edimilsonldutra.cleanarchsimple.core.domain.Address;
import com.github.edimilsonldutra.cleanarchsimple.dataprovider.client.FindAddressByZipCodeClient;
import com.github.edimilsonldutra.cleanarchsimple.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddresByZipCode {

    @Autowired
    private FindAddressByZipCodeClient client;
    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = client.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
