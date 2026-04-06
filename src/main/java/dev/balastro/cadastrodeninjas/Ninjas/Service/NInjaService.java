package dev.balastro.cadastrodeninjas.Ninjas.Service;

import dev.balastro.cadastrodeninjas.Ninjas.NinjaDTO;
import dev.balastro.cadastrodeninjas.Ninjas.NinjaMapper;
import dev.balastro.cadastrodeninjas.Ninjas.NinjaModel;
import dev.balastro.cadastrodeninjas.Ninjas.Repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NInjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NInjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;

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

    //criar ninja
    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){ //PARAMETROS DO NINJA MODEL
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }

    //deletar ninja -- tem que ser metodo void, pois, nao precisa retornar nada pro servidor
    public void deletarNinja(Long id){
        ninjaRepository.deleteById(id);
    }

    //atualizar ninja
    public NinjaModel atualizarninja(Long id, NinjaModel ninjaAtualizado){
        if(ninjaRepository.existsById(id)){
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null; // caso nao exista esse id
    }


}
