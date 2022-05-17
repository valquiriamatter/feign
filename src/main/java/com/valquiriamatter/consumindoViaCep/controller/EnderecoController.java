package com.valquiriamatter.consumindoViaCep.controller;

import com.valquiriamatter.consumindoViaCep.cliente.EnderecoClient;
import com.valquiriamatter.consumindoViaCep.modelo.Endereco;
import com.valquiriamatter.consumindoViaCep.service.EnderecoService;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/viaCep")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{cep}", method = RequestMethod.GET)
    public Endereco getEndereco(@PathVariable String cep) {
        return enderecoService.getEndereco(cep);
    }

}
