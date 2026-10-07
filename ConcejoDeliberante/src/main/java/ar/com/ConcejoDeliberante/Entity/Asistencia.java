package ar.com.ConcejoDeliberante.Entity;

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
	@JoinColumn(name="id_concejal")
	Concejal concejal;
	
	@ManyToOne
	@JoinColumn(name="id_actividad")
	Actividad actividad;
	
	private boolean estado;
	
	
	public Asistencia() {
		super();
	}

	public Asistencia(int id_asistencia, Concejal concejal, Actividad actividad, boolean estado) {
		super();
		this.id_asistencia = id_asistencia;
		this.concejal = concejal;
		this.actividad = actividad;
		this.estado = estado;
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



	public Concejal getConcejal() {
		return concejal;
	}



	public void setConcejal(Concejal concejal) {
		this.concejal = concejal;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
	
}
