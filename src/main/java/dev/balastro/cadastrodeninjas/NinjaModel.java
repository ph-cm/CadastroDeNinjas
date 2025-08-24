package dev.balastro.cadastrodeninjas;

import jakarta.persistence.*;

// JPA = Java Persistence API
@Entity //transformar essa classe em uma entidade para o banco de dados, criando uma tabela comas as colunas das respectivas variaveis
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id //Atributo logo abaixo sera o ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Passar uma estrategia de como sera passado o id
    // transformar isso em tabela (entidades) que sera salva no banco
    private Long id; //por causa do banco
    private String nome;
    private String email;
    private int idade;

    //construtor no args
    public NinjaModel() {
    }
    //construtor full args
    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
