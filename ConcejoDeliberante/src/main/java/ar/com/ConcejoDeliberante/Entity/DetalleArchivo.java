package ar.com.ConcejoDeliberante.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DetalleArchivo {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @ManyToOne
    @JoinColumn(name = "id_detalle")
    DetalleActividad detalle;

    @ManyToOne
    @JoinColumn(name = "id_archivo")
    Archivo archivo;

	public DetalleArchivo() {
		super();
	}

	public DetalleArchivo(int id, DetalleActividad detalle, Archivo archivo) {
		super();
		this.id = id;
		this.detalle = detalle;
		this.archivo = archivo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DetalleActividad getDetalle() {
		return detalle;
	}

	public void setDetalle(DetalleActividad detalle) {
		this.detalle = detalle;
	}

	public Archivo getArchivo() {
		return archivo;
	}

	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}
    
    
	
}
