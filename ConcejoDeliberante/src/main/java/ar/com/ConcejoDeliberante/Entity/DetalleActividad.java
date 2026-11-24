package ar.com.ConcejoDeliberante.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.List;

import ar.com.ConcejoDeliberante.Entity.Actividad;

import jakarta.persistence.OneToMany;

@Entity
public class DetalleActividad {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	
	@ManyToOne
	@JoinColumn(name ="id_actividad")
	Actividad actividad;
	
	@OneToMany(mappedBy = "detalle")
    List<DetalleArchivo> archivos = new ArrayList<>();

	public DetalleActividad() {
		
	}


	public DetalleActividad(int id, Actividad actividad, List<DetalleArchivo> archivos) {
		this.id = id;
		this.actividad = actividad;
		this.archivos = archivos;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;

	}


	public List<DetalleArchivo> getArchivos() {
		return archivos;
	}


	public void setArchivos(List<DetalleArchivo> archivos) {
		this.archivos = archivos;
	}
	
	

}
