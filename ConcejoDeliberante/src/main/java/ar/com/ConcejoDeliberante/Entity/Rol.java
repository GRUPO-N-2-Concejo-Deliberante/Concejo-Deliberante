package ar.com.ConcejoDeliberante.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Rol {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	String cargo;

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
