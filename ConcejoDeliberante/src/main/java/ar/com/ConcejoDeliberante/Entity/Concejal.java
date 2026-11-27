package ar.com.ConcejoDeliberante.Entity;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Concejal extends Usuario{
	
	@OneToMany(mappedBy = "concejal")
	private List<Archivo> archivos;
	
	  @OneToMany(mappedBy = "concejal")
	    List<DetalleAsistencia> asistencia = new ArrayList<>();
	

	
	public Concejal() {
		super();
		
	}


	public Concejal(List<Archivo> archivos, List<DetalleAsistencia> asistencia) {
		super();
		this.archivos = archivos;
		this.asistencia = asistencia;
	}



	public List<Archivo> getArchivos() {
		return archivos;
	}

	public void setArchivos(List<Archivo> archivos) {
		this.archivos = archivos;
	}


	public List<DetalleAsistencia> getAsistencia() {
		return asistencia;
	}


	public void setAsistencia(List<DetalleAsistencia> asistencia) {
		this.asistencia = asistencia;
	}


	


	
}
