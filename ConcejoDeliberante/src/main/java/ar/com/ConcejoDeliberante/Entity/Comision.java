package ar.com.ConcejoDeliberante.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Comision {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	String nombre;

 public Comision(String nombre) {
	super();
	this.nombre = nombre;
 }

 public String getNombre() {
	return nombre;
 }

 public void setNombre(String nombre) {
	this.nombre = nombre;
 }
 
}
