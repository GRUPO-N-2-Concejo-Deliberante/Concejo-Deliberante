package ar.com.ConcejoDeliberante.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Archivo {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int idArchivo;
	
	@ManyToOne
	@JoinColumn(name="id_tipo")
	TipoArchivo tipoArchivo;
	
	@ManyToOne
	@JoinColumn(name="id_comision")
	Comision comision;
	
	@ManyToOne
	@JoinColumn(name = "id_concejal")
	Concejal concejal;

	@OneToMany(mappedBy = "archivo")
    private List<DetalleActividad> detallesActividad;
	
	String nombre;
	String archivoFisico;
	String estado;
	String hora;
	String fecha;
	
	
	public Archivo() {
		super();
	}



	



	public Archivo(int idArchivo, TipoArchivo tipoArchivo, Comision comision, Concejal concejal,
			List<DetalleActividad> detallesActividad, String nombre, String archivoFisico, String estado, String hora,
			String fecha) {
		super();
		this.idArchivo = idArchivo;
		this.tipoArchivo = tipoArchivo;
		this.comision = comision;
		this.concejal = concejal;
		this.detallesActividad = detallesActividad;
		this.nombre = nombre;
		this.archivoFisico = archivoFisico;
		this.estado = estado;
		this.hora = hora;
		this.fecha = fecha;
	}



	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public String getHora() {
		return hora;
	}



	public void setHora(String hora) {
		this.hora = hora;
	}


	public int getIdArchivo() {
		return idArchivo;
	}



	public void setIdArchivo(int idArchivo) {
		this.idArchivo = idArchivo;
	}



	public TipoArchivo getTipoArchivo() {
		return tipoArchivo;
	}



	public void setTipoArchivo(TipoArchivo tipoArchivo) {
		this.tipoArchivo = tipoArchivo;
	}



	public Comision getComision() {
		return comision;
	}



	public void setComision(Comision comision) {
		this.comision = comision;
	}



	public Concejal getConcejal() {
		return concejal;
	}



	public void setConcejal(Concejal concejal) {
		this.concejal = concejal;
	}



	public List<DetalleActividad> getDetallesActividad() {
		return detallesActividad;
	}



	public void setDetallesActividad(List<DetalleActividad> detallesActividad) {
		this.detallesActividad = detallesActividad;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getArchivoFisico() {
		return archivoFisico;
	}



	public void setArchivoFisico(String archivoFisico) {
		this.archivoFisico = archivoFisico;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	
}

