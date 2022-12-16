package com.example.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.crudspring.model.Pessoa;
import com.example.crudspring.repository.PessoaRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(PessoaRepository pessoaRepository){
		return args -> {
			pessoaRepository.deleteAll();
			
			Pessoa p = new Pessoa();
			p.setName("Rodrigo");
			p.setEmail("rodrigo@gmail.com");
			p.setTelefone("(45)98812-8848");
			
			pessoaRepository.save(p);
		};
	}

}
