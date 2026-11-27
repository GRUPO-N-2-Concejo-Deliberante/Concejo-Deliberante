package ar.com.ConcejoDeliberante.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Asistencia {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id_asistencia;
	
	@ManyToOne
	@JoinColumn(name="id_actividad")
	Actividad actividad;
	
    @OneToMany(mappedBy = "asistencia")
    List<DetalleAsistencia> asistencia = new ArrayList<>();
    
    
	public Asistencia() {
	
	}


	public Asistencia(int id_asistencia, Actividad actividad, List<DetalleAsistencia> asistencia) {
		super();
		this.id_asistencia = id_asistencia;
		this.actividad = actividad;
		this.asistencia = asistencia;
		
	}


	public int getId_asistencia() {
		return id_asistencia;
	}


	public void setId_asistencia(int id_asistencia) {
		this.id_asistencia = id_asistencia;
	}


	public Actividad getActividad() {
		return actividad;
	}


	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}


	public List<DetalleAsistencia> getAsistencia() {
		return asistencia;
	}


	public void setAsistencia(List<DetalleAsistencia> asistencia) {
		this.asistencia = asistencia;
	}

}
