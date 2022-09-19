package br.com.projeto.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "id_cliente")
	private Integer id;
	private String nome;
	private String email;
	
	public Cliente() {
		
	}
	
	public Cliente(String name, String email) {
		super();
		this.nome = name;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String name) {
		this.nome = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "nome = " + this.nome +
				"/ email = " + this.email;
	}

	public void setId(Integer id) {
		this.id = id;
		
	}
	
	
}
