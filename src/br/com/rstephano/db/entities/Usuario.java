package br.com.rstephano.db.entities;

import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity(value = "usuarios", noClassnameStored = true)
public class Usuario {
	@Id
	private ObjectId id;
	private String usuario;
	private String email;
	private String senha;
	private Date dataCadastro;

	public Usuario(ObjectId id, String usuario, String email, String senha, Date dataCadastro) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.email = email;
		this.senha = senha;
		this.dataCadastro = dataCadastro;
	}

	public Usuario() {
		super();
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}
