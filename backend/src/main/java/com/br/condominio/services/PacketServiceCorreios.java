package com.br.condominio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.condominio.correios.CorreiosAPI;

import java.math.BigDecimal;

@Service
public class PacketServiceCorreios {

    @Autowired
    public CorreiosAPI correiosApi;

    public BigDecimal checkBalance() {
        return correiosApi.getBalance();
    }

}
