package com.aula.solid.isp;

import org.springframework.stereotype.Service;

@Service
public class Desenvolvedor implements Funcionario {

    @Override
    public void programar() {
        System.out.println("Escrevendo código Java/Spring...");
    }

    @Override
    public void aprovarOrcamento() {
        throw new UnsupportedOperationException("Desenvolvedor não aprova orçamento!");
    }

    @Override
    public void atenderCliente() {
        throw new UnsupportedOperationException("Desenvolvedor não atende cliente!");
    }

    @Override
    public Double calcularSalario() {
        return 8000.0;
    }
}
