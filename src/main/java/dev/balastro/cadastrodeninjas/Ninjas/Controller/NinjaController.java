package dev.balastro.cadastrodeninjas.Ninjas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //falando o que é uma annotation controller (Fala que é um controller)
@RequestMapping // mapeamento de rotas(colocar todas as rotas num mesmo lugar
public class NinjaController {
    // Controller
    @GetMapping("/boasvindas") // pegar info boasvindas e joga na rota localhost:8080/boasVindas
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

}
