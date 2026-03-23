package com.bn.ex2.repositories;

import com.bn.ex2.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}