package ar.com.ConcejoDeliberante.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity

public class Comision {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	
	@OneToMany(mappedBy = "comision")
	private List<Archivo> archivos;
	
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
