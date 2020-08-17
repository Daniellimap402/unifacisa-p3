package com.example.atividade;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data @Entity
public class Employees {

	@Id
	private long cpf;
	
	private String nome;
	private String cargo;
}
