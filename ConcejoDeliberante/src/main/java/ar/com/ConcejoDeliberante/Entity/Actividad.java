package ar.com.ConcejoDeliberante.Entity;

import java.sql.Date;
import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Actividad {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	 int id_actividad;
	
	
	LocalTime horaEntrada;
	LocalTime horaSalida;
	Date fecha;
	
	@OneToMany(mappedBy = "concejal")
    private List<Asistencia> asistencias;
	
	@OneToMany(mappedBy = "actividad")
    private List<DetalleActividad> detallesActividad;
	
	
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


	public List<Asistencia> getAsistencias() {
		return asistencias;
	}


	public void setAsistencias(List<Asistencia> asistencias) {
		this.asistencias = asistencias;
	}


	public List<DetalleActividad> getDetallesActividad() {
		return detallesActividad;
	}


	public void setDetallesActividad(List<DetalleActividad> detallesActividad) {
		this.detallesActividad = detallesActividad;
	}
	
	
	
	
}
