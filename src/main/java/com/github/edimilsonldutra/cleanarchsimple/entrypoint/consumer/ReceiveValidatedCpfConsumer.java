package com.github.edimilsonldutra.cleanarchsimple.entrypoint.consumer;

import com.github.edimilsonldutra.cleanarchsimple.core.usecase.UpdateCustomerUseCase;
import com.github.edimilsonldutra.cleanarchsimple.entrypoint.consumer.mapper.CustomerMessageMapper;
import com.github.edimilsonldutra.cleanarchsimple.entrypoint.consumer.message.CustomerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "eldutra")
    public void receive(CustomerMessage customerMessage) {
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerUseCase.update(customer, customerMessage.getZipCode());
    }
}
