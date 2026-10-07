package ar.com.ConcejoDeliberante.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class DetalleActividad {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	
	@OneToMany
	@JoinColumn(name ="id_actividad")
	Actividad actividad;
	
	@OneToMany
	@JoinColumn(name="id_archivo")
	
	
	Archivo archivo;
	
	public DetalleActividad(int id, Actividad actividad, Archivo archivo) {
		this.id = id;
		this.actividad = actividad;
		this.archivo = archivo;
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

	public Archivo getArchivo() {
		return archivo;
	}

	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}
	


}
