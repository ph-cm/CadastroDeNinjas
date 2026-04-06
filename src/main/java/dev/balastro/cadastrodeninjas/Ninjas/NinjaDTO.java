package dev.balastro.cadastrodeninjas.Ninjas;

import dev.balastro.cadastrodeninjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor // lombok ja cria automaticamente
@AllArgsConstructor // lombok
@Data // criar getter e setter
public class NinjaDTO {

        private Long id; //por causa do banco
        private String nome;
        private String email;
        private int idade;
        private String imgURL;
        private MissoesModel missoes;
        private String rank;

}
