package com.example.ProjetoInicial.service;

import com.example.ProjetoInicial.entties.Category;
import com.example.ProjetoInicial.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    public CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }
}
