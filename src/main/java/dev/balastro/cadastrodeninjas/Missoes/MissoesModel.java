package dev.balastro.cadastrodeninjas.Missoes;

import dev.balastro.cadastrodeninjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missao")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String dificuldade;
    private NinjaModel ninja; // pois preciso de linkar um ninja a missao


}
