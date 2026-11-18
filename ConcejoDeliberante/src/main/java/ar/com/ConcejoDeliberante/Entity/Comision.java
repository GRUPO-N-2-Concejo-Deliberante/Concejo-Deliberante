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
	
	 public Comision() {
		super();
	}

	 public Comision(String nombre) {
		super();
		this.nombre = nombre;
	 }

	 public int getId() {
		return id;
	}



	 public void setId(int id) {
		 this.id = id;
	 }



	 public List<Archivo> getArchivos() {
		 return archivos;
	 }



	 public void setArchivos(List<Archivo> archivos) {
		 this.archivos = archivos;
	 }



	 public String getNombre() {
		return nombre;
	 }
	
	 public void setNombre(String nombre) {
		this.nombre = nombre;
	 }
	 
	 
 
}
