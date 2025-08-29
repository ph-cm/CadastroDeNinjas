package dev.balastro.cadastrodeninjas.Missoes;

import dev.balastro.cadastrodeninjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missao")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String dificuldade;

    @OneToMany(mappedBy = "missoes") // uma missao pode ter varios ninjas
    private List<NinjaModel> ninjas; // pois preciso de linkar um ninja a missao

}