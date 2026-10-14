package ar.com.ConcejoDeliberante.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Rol {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	
	@OneToMany(mappedBy = "tipoRol")
    private List<Usuario> usuarios;
	
	
	String cargo;

 public Rol() {
		super();
	}

 public Rol(int id, String cargo, List<Usuario> usuarios) {
		super();
		this.id = id;
		this.cargo = cargo;
		this.usuarios = usuarios;
	}

 public int getId() {
	return id;
 }

 public void setId(int id) {
	this.id = id;
 }

 public String getCargo() {
	return cargo;
 }

 public void setCargo(String cargo) {
	this.cargo = cargo;
 }

 public List<Usuario> getUsuarios() {
	return usuarios;
 }

 public void setUsuarios(List<Usuario> usuarios) {
	this.usuarios = usuarios;
 }

 
 
 
}
