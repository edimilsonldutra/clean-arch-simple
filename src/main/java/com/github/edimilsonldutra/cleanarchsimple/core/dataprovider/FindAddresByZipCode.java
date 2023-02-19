package com.github.edimilsonldutra.cleanarchsimple.core.dataprovider;

import com.github.edimilsonldutra.cleanarchsimple.core.domain.Address;

public interface FindAddresByZipCode {

    Address find(final String zipCode);
}
