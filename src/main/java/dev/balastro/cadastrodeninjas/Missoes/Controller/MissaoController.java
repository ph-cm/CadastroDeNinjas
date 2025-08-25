package dev.balastro.cadastrodeninjas.Missoes.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // dizer que é um controller
@RequestMapping // dizer que tera requisição de mapeamento
public class MissaoController {

    @GetMapping("/boasvindasmissao")
    public String boasVindas(){
        return "Boas vindas a rota de missoes";
    }
}
