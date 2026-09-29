# SOLID Refactoring (Spring Boot)

Projeto com violações propositais de SOLID para os estudantes refatorarem.

## Executar
```
mvn spring-boot:run
```

## Endpoints
| Método | URL | Comportamento atual |
|---|---|---|
| GET | `/api/aula/testar-isp` | Retorna 500 (`UnsupportedOperationException`) |
| POST | `/api/aula/testar-dip?id=123&email=a@b.com` | Funciona, mas está acoplado ao SMTP |

## Desafios
1. **ISP** – Quebrar `Funcionario` em interfaces coesas (ex.: `Programador`, `Aprovador`, `Atendente`, `Remunerado`) de modo que `Desenvolvedor` implemente só o que faz sentido. `/testar-isp` não pode mais gerar erro 500.
2. **DIP** – Criar uma abstração (ex.: `NotificacaoService`) e fazer `PedidoService` depender dela, com injeção por construtor. Adicionar uma implementação `SmsService` e trocar a implementação sem alterar `PedidoService`.
3. Substituir `@Autowired` em campo por injeção via construtor.
