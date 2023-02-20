package com.github.edimilsonldutra.cleanarchsimple.dataprovider.repository;

import com.github.edimilsonldutra.cleanarchsimple.dataprovider.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
