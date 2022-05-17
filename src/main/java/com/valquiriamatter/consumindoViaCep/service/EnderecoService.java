package com.valquiriamatter.consumindoViaCep.service;

import com.valquiriamatter.consumindoViaCep.cliente.EnderecoClient;
import com.valquiriamatter.consumindoViaCep.modelo.Endereco;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    private final EnderecoClient enderecoClient;

    public EnderecoService(EnderecoClient enderecoClient) {
        this.enderecoClient = enderecoClient;
    }

    public Endereco getEndereco(String cep) {
        return enderecoClient.getEndereco(cep);
    }

}
