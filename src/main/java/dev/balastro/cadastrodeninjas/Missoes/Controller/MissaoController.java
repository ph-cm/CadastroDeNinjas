package dev.balastro.cadastrodeninjas.Missoes.Controller;


import org.springframework.web.bind.annotation.*;

//LOCALHOST:8080 == RPECISAMOS DE DESENVOOLVER AS ROTAS PARA O SERVIDOR "LOCALHOST:8080"
//CAMADA MAIS PROXIMA DO USUARIO

//ANOTATIONS
@RestController // dizer que é um controller
@RequestMapping("missoes")// dizer que tera requisição de mapeamento - REDIRECIONAMENTO BASEADO EM PATH(CAMINHO)
public class MissaoController {

    @GetMapping("/saudacao")
    public String saudarMissao() {
        return "Bem vindo a aba de missoes";
    }

    //GET -- MANDAR REQUISICAO PRA MOSTRAR AS MISSOES
    @GetMapping("/listar")
    public String listarMissoes(){
        return "Missoes listadas";
    }

    //POST -- MANDAR UMA REQUISICAO PARA CRIAR REQUISICOES
    @PostMapping("/criar") //POST = ACESSO A ROTA - USUARIO MANDA PRA MIM
    public String criarMissao(){
        return "Boas vindas a rota de missoes";
    }

    //PUT -- MANDAR REQUISICAO PARA ALTERAR AS MISSOES
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missao alterada com sucesso";
    }

    //DELETE -- REQUISICAO PARA DELETAR AS MISSOES
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missao deletada com sucesso";
    }
}
