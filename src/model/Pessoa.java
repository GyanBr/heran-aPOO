package model;

import java.time.LocalDate;

public class Pessoa {
    private Integer id;
    private String nome;
    private Integer idade;
    private String endereco;
    //private String criadoEm = LocalDate.now();

    public Pessoa() {

    }
    public Pessoa(Integer id, String nome, Integer idade, String endereco) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
       // this.criadoEm = criadoEm;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

//    public String getCriadoEm() {
//        return criadoEm;
//    }
//
//    public void setCriadoEm(String criadoEm) {
//        this.criadoEm = criadoEm;
//    }
    public void apresentar(){
        System.out.println("Nome: " + nome + "Idade: " + idade +
                "Endereco: " + endereco );
    }
}
