package com.github.vitorlima1602.produtosapi.repository;

import com.github.vitorlima1602.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// JpaRepository<T, ID> - T: Tipo da entidade, ID: Tipo do identificador da entidade
// JpaRepository já possui os métodos básicos de CRUD (Create, Read, Update, Delete)
// Não é necessário implementar a interface, o Spring Data JPA faz isso automaticamente
// Exemplo de uso: produtoRepository.save(produto), produtoRepository.findById(id), produtoRepository.findAll(), produtoRepository.deleteById(id)
public interface ProdutoRepository extends JpaRepository<Produto, String> {
//     Método para buscar produtos pelo nome, ignorando maiúsculas e minúsculas
//     O Spring Data JPA interpreta o nome do método e gera a consulta automaticamente
    List<Produto> findByNomeContainingIgnoreCase(String nome);
}
