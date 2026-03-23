package com.bn.ex2.services;

import com.bn.ex2.models.ProdutoModel;
import com.bn.ex2.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public ProdutoModel criarProduto(ProdutoModel produto) {
        return repository.save(produto);
    }

    public List<ProdutoModel> findAll() {
        return repository.findAll();
    }

    public ProdutoModel buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletarProduto(Long id) {
        repository.deleteById(id);
    }
}