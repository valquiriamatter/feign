package com.valquiriamatter.consumindoViaCep.service;

import com.valquiriamatter.consumindoViaCep.cliente.EnderecoClient;
import com.valquiriamatter.consumindoViaCep.modelo.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoClient enderecoClient;

    public Endereco getEndereco(String cep) {
        return enderecoClient.getEndereco(cep);
    }

}
