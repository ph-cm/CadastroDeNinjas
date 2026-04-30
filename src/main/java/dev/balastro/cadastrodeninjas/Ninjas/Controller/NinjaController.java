package dev.balastro.cadastrodeninjas.Ninjas.Controller;

import dev.balastro.cadastrodeninjas.Ninjas.NinjaDTO;
import dev.balastro.cadastrodeninjas.Ninjas.NinjaModel;
import dev.balastro.cadastrodeninjas.Ninjas.Service.NInjaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.SimpleTimeZone;

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
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninja){

       NinjaDTO novoNinja = nInjaService.criarNinja(ninja);

       return ResponseEntity.status(HttpStatus.CREATED)
               .body("Ninja Criado Com Sucesso: " + novoNinja.getNome() + " (ID): " + novoNinja.getId());
    }

    //Procurar Ninja por ID (READ)
    @GetMapping("/todos")
    public String mostrarNinjaPorId(){
        return "Ninja Tal de Id Tal";
    }

    @GetMapping("/listar")
    public ResponseEntity<List<NinjaDTO>> listarNinjas(){
    List<NinjaDTO> ninjas = nInjaService.listarNinjas();
    return ResponseEntity.ok(ninjas);

    }
 
    //Mostrar Ninja (READ)
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarNinjasPorId(@PathVariable Long id){ //PATHVARIABLE == VARIAVEL QUE VEM DO CLIENTE

        NinjaDTO ninja = nInjaService.listarNinjasPorId(id);

        if(ninja != null){
            return ResponseEntity.ok(ninja);
        }
        else {

        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Ninja Nao encontrado");
    }

    //Alterar Ninja(UPDATE) put altera toodo o objeto
    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarNinjaPorId(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado){

        NinjaDTO updateNinja = nInjaService.atualizarninja(id, ninjaAtualizado);

        if (updateNinja != null){
            return ResponseEntity.ok(updateNinja);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja nao encontrado");
        }

    }

    //Deletar Ninja(DELETE)
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarNinja(@PathVariable Long id){

        if(nInjaService.listarNinjasPorId(id) != null) {
            nInjaService.deletarNinja(id);
            return ResponseEntity.ok("Ninja deletado com sucesso");
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O ninja nao foi encontrado");
        }
    }
}
