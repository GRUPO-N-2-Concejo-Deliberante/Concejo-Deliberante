package ar.com.ConcejoDeliberante.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Concejal extends Usuario{
	
	
	

	public Concejal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Concejal(String nombre, String apellido, String correo, String telefono, Rol tipoRol) {
		super(nombre, apellido, correo, telefono, tipoRol);
		// TODO Auto-generated constructor stub
	}

	

	
	
	
}
