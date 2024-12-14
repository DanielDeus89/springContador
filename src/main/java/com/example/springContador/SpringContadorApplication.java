package com.example.springContador;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class SpringContadorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringContadorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tarefa tarefa = new Tarefa("Estudar Json",false,"Daniel");
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(new File("tarefa.json"), tarefa);
		System.out.println("Arquivo JSON criado com sucesso!");

	}
}
