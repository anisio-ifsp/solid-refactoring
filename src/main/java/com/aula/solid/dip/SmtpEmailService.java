package com.aula.solid.dip;

import org.springframework.stereotype.Service;

@Service
public class SmtpEmailService {

    public void enviarEmail(String mensagem, String destinatario) {
        System.out.println("[SMTP CONCRETO] Enviando e-mail para " + destinatario + ": " + mensagem);
    }
}
