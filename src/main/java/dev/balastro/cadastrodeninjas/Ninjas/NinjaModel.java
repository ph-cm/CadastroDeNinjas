package dev.balastro.cadastrodeninjas.Ninjas;

import dev.balastro.cadastrodeninjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// JPA = Java Persistence API
@Entity //transformar essa classe em uma entidade para o banco de dados, criando uma tabela comas as colunas das respectivas variaveis
@Table(name = "tb_cadastro")
@NoArgsConstructor // lombok ja cria automaticamente
@AllArgsConstructor // lombok
@Data // criar getter e setter
public class NinjaModel {

    @Id //Atributo logo abaixo sera o ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Passar uma estrategia de como sera passado o id
    // transformar isso em tabela (entidades) que sera salva no banco
    private Long id; //por causa do banco

    private String nome;

    @Column(unique = true) //evita emails repetidos
    private String email;

    private int idade;

    // Classe ninja tera somente uma unica missao atrelada a cada objeto
    @ManyToOne // coluna que tenha somente um elemento
    @JoinColumn(name = "missoes_id") // Foreing Key == vai adicionar mais uma coluna(uma especie de chave)
    private MissoesModel missoes;

    private String corDoOlho;
}
