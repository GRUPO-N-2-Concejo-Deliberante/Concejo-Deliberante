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
	String cargo;
	
	@OneToMany(mappedBy = "tipoRol")
    private List<Usuario> usuarios;

 public Rol(String cargo) {
	this.cargo = cargo;
 }

 public String getCargo() {
	return cargo;
 }

 public void setCargo(String cargo) {
	this.cargo = cargo;
 }
 
 
}
