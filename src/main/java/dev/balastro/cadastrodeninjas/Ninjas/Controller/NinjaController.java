package dev.balastro.cadastrodeninjas.Ninjas.Controller;

import dev.balastro.cadastrodeninjas.Ninjas.NinjaModel;
import dev.balastro.cadastrodeninjas.Ninjas.Service.NInjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //falando o que é uma annotation controller (Fala que é um controller)
@RequestMapping("/ninjas") // mapeamento de rotas(colocar todas as rotas num mesmo lugar
public class NinjaController {

    private NInjaService nInjaService;

    public NinjaController(NInjaService nInjaService) {
        this.nInjaService = nInjaService;
    }

    // Controller
    @GetMapping("/boasvindas") // pegar info boasvindas e joga na rota localhost:8080/boasVindas
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

    //Endpoints
    //Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return nInjaService.criarNinja(ninja);
    }

    //Procurar Ninja por ID (READ)
    @GetMapping("/todos")
    public String mostrarNinjaPorId(){
        return "Ninja Tal de Id Tal";
    }

    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return nInjaService.listarNinjas();
    }
 
    //Mostrar Ninja (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id){ //PATHVARIABLE == VARIAVEL QUE VEM DO CLIENTE
        return nInjaService.listarNinjasPorId(id);
    }

    //Alterar Ninja(UPDATE) put altera todo o objeto
    @PutMapping("/alterar/{id}")
    public NinjaModel alterarNinjaPorId(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado){
        return nInjaService.atualizarninja(id, ninjaAtualizado);
    }

    //Deletar Ninja(DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinja(@PathVariable Long id){
        nInjaService.deletarNinja(id);
    }
}
