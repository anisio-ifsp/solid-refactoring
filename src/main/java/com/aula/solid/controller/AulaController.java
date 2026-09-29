package com.aula.solid.controller;

import com.aula.solid.dip.PedidoService;
import com.aula.solid.isp.Desenvolvedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/aula")
public class AulaController {

    @Autowired
    private Desenvolvedor dev;

    @Autowired
    private PedidoService pedidoService;

    // 🔴 Teste do ISP: Vai estourar exceção 500 em tempo de execução!
    @GetMapping("/testar-isp")
    public ResponseEntity<String> testarIsp() {
        dev.programar();
        // A chamada abaixo estoura UnsupportedOperationException
        dev.aprovarOrcamento();
        return ResponseEntity.ok("Sucesso!");
    }

    // 🔴 Teste do DIP: Funciona, mas pergunte: "Como trocamos para SMS sem mexer no PedidoService?"
    @PostMapping("/testar-dip")
    public ResponseEntity<String> testarDip(@RequestParam String id, @RequestParam String email) {
        pedidoService.processarPedido(id, email);
        return ResponseEntity.ok("Pedido processado!");
    }
}
