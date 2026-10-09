package ar.com.ConcejoDeliberante.Entity;


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
    private List<Asistencia> asistencias;
	

	
	public Concejal() {
		super();
		
	}

	

	public Concejal(String nombre, String apellido, String correo, String telefono, Rol tipoRol, List<Archivo> archivos,
			List<Asistencia> asistencias) {
		super(nombre, apellido, correo, telefono, tipoRol);
		this.archivos = archivos;
		this.asistencias = asistencias;
	}



	public List<Archivo> getArchivos() {
		return archivos;
	}

	public void setArchivos(List<Archivo> archivos) {
		this.archivos = archivos;
	}

	public List<Asistencia> getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(List<Asistencia> asistencias) {
		this.asistencias = asistencias;
	}


	
}
