package com.github.edimilsonldutra.cleanarchsimple.entrypoint.controller.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CustomerResquest {
    @NotBlank
    private String name;
    @NotBlank
    private String cpf;
    @NotBlank
    private String zipCode;
}
