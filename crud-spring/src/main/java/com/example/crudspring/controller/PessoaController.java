package com.example.crudspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudspring.model.Pessoa;
import com.example.crudspring.repository.PessoaRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/pessoas")
@AllArgsConstructor
public class PessoaController {
    
   
    private final PessoaRepository pessoaRepository;


    @GetMapping
    public List<Pessoa> list(){
        return pessoaRepository.findAll();
    }


}
