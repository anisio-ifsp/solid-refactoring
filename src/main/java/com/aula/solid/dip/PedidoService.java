package com.aula.solid.dip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private SmtpEmailService emailService;

    public void processarPedido(String idPedido, String clienteEmail) {
        System.out.println("Processando pedido #" + idPedido);

        emailService.enviarEmail("Seu pedido " + idPedido + " foi aprovado!", clienteEmail);
    }
}
