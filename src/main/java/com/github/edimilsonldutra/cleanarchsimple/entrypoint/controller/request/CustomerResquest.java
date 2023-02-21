package com.github.edimilsonldutra.cleanarchsimple.entrypoint.controller.request;


import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CustomerResquest {
    @NotBlank
    private String name;
    @NotBlank
    private String cpf;
    @NotBlank
    private String zipCode;
}
