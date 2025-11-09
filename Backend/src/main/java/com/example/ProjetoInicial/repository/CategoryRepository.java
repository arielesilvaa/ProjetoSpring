package com.example.ProjetoInicial.repository;

import com.example.ProjetoInicial.entties.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository <Category, Long> {
}
