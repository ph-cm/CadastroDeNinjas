package dev.balastro.cadastrodeninjas.Ninjas.Repository;

import dev.balastro.cadastrodeninjas.Ninjas.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {

}
