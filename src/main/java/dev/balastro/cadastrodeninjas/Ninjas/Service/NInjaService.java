package dev.balastro.cadastrodeninjas.Ninjas.Service;

import dev.balastro.cadastrodeninjas.Ninjas.NinjaModel;
import dev.balastro.cadastrodeninjas.Ninjas.Repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

}
