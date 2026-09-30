package ar.com.ConcejoDeliberante.Entity;

import java.sql.Date;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Actividad {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	 int id_actividad;
	
	
	LocalTime horaEntrada;
	LocalTime horaSalida;
	Date fecha;
	
	
	public Actividad(int id_actividad, LocalTime horaEntrada, LocalTime horaSalida, Date fecha) {
		super();
		this.id_actividad = id_actividad;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
		this.fecha = fecha;
	}


	public int getId_actividad() {
		return id_actividad;
	}


	public void setId_actividad(int id_actividad) {
		this.id_actividad = id_actividad;
	}


	public LocalTime getHoraEntrada() {
		return horaEntrada;
	}


	public void setHoraEntrada(LocalTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}


	public LocalTime getHoraSalida() {
		return horaSalida;
	}


	public void setHoraSalida(LocalTime horaSalida) {
		this.horaSalida = horaSalida;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
