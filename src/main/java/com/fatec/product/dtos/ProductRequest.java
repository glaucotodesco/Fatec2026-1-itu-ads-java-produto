package com.fatec.product.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ProductRequest(

    @NotBlank(message = "Nome não pode ser em branco")
    @Size(min=4, max=30, message="Nome deve ter no minimo 3 e no máximo 30 caracteres")
    String name,

    @NotBlank(message = "Descrição não pode ser em branco")
    @Size(min=4, max=100, message="Descriçãp deve ter no minimo 3 e no máximo 30 caracteres")
    String description,
    
    @Min(value=0, message = "Preço não poder menor que zero")
    Double price

) {
    
}
