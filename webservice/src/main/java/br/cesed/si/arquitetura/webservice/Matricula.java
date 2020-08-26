package br.cesed.si.arquitetura.webservice;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Matricula {

	@Id
	private int matricula;
	
	private double anoIngresso;
	
	private String nome; 
	
	private String curso;
	
	private long cpf;

}

