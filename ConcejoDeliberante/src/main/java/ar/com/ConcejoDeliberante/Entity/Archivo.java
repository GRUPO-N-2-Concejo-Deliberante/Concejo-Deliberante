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
	int id_archivo;
	
	@ManyToOne
	@JoinColumn(name="id_tipo")
	TipoArchivo tipo;
	
	@ManyToOne
	@JoinColumn(name="id_comision")
	Comision comision;
	
	@ManyToOne
	@JoinColumn(name = "id_concejal")
	
	@OneToMany(mappedBy = "archivo")
    private List<DetalleActividad> detallesActividad;
	
	String nombre;
	Boolean estado;
	Concejal concejal;
	
	
	public Archivo() {
		super();
	}


	public Archivo(String nombre, TipoArchivo tipo, Boolean estado, Comision comision, Concejal concejal) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.estado = estado;
		this.comision = comision;
		this.concejal = concejal;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public TipoArchivo getTipo() {
		return tipo;
	}


	public void setTipo(TipoArchivo tipo) {
		this.tipo = tipo;
	}


	public Boolean getEstado() {
		return estado;
	}


	public void setEstado(Boolean estado) {
		this.estado = estado;
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
	
	
	public List<Archivo> ListaArchivo (){
		return ListaArchivo();
		
	}


	public int getId_archivo() {
		return id_archivo;
	}


	public void setId_archivo(int id_archivo) {
		this.id_archivo = id_archivo;
	}


	public List<DetalleActividad> getDetallesActividad() {
		return detallesActividad;
	}


	public void setDetallesActividad(List<DetalleActividad> detallesActividad) {
		this.detallesActividad = detallesActividad;
	}
	
	
	
}
