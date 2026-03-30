package dev.balastro.cadastrodeninjas.Ninjas.Service;

import dev.balastro.cadastrodeninjas.Ninjas.NinjaModel;
import dev.balastro.cadastrodeninjas.Ninjas.Repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NInjaService {

    private NinjaRepository ninjaRepository;

    public NInjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos os ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    //Listar todos os ninjas por ID
    public NinjaModel listarNinjasPorId(Long id){
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);//optional ninja por ou nao existir, findbyid eh select by id
        return ninjaPorId.orElse(null);
    }

    //Inserir/criar ninja
    public NinjaModel criarNinja(NinjaModel ninja){ //PARAMETROS DO NINJA MODEL
        return ninjaRepository.save(ninja);
    }
}
