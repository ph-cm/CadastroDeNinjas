package dev.balastro.cadastrodeninjas.Missoes.Repository;

import dev.balastro.cadastrodeninjas.Missoes.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> { // deixa long pois eh o tipo do id
}
