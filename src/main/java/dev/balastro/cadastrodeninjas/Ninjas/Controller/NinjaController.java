package dev.balastro.cadastrodeninjas.Ninjas.Controller;

import org.springframework.web.bind.annotation.*;

@RestController //falando o que é uma annotation controller (Fala que é um controller)
@RequestMapping // mapeamento de rotas(colocar todas as rotas num mesmo lugar
public class NinjaController {
    // Controller
    @GetMapping("/boasvindas") // pegar info boasvindas e joga na rota localhost:8080/boasVindas
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

    //Endpoints
    //Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja Criado";
    }

    //Procurar Ninja por ID (READ)
    @GetMapping("/todos")
    public String mostrarNinjaPorId(){
        return "Ninja Tal de Id Tal";
    }

    //Mostrar Ninja (READ)
    @GetMapping("/mostar")
    public String mostrarTodosOsNinjas(){
        return "Todos os Ninjas";
    }

    //Alterar Ninja(UPDATE)
    @PutMapping("/alterarId")
    public String alterarNinjaPorId(){
        return "Ninja Alterado";
    }

    //Deletar Ninja(DELETE)
    @DeleteMapping("/deletar")
    public String deletarNinja(){
        return "Ninja Deletado";
    }
}
