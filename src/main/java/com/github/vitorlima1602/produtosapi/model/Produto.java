package com.github.vitorlima1602.produtosapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//POJO - Plain Old Java Object

@Entity
//Anotação para mapear a classe com a tabela do banco de dados
// Não se faz necessário colocar @Table em todas as classes, apenas quando o nome da tabela for diferente do nome da classe
@Table(name = "produto")
public class Produto {
    @Id //Anotação para mapear a chave primária
    //Anotação para mapear os atributos com as colunas do banco de dados
    //Não se faz necessário colocar @Column em todos os atributos, apenas quando o nome da coluna for diferente do nome do atributo
    //ou quando for necessário configurar alguma propriedade da coluna, como tamanho, se pode ser nulo, etc.
    @Column(name = "id")
    private String id;

    @Column(name = "nome")
    private String nome;

    @Column
    private String descricao;

    @Column
    private Double preco;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
