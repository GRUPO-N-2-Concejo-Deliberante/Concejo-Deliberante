package ar.com.ConcejoDeliberante.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Secretaria extends Usuario{
	
	
	public Secretaria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Secretaria(int id, String nombre, String apellido, String DNI, String correo, String telefono,
			boolean estado, String nombreUsuario, String password, Rol tipoRol) {
		super(id, nombre, apellido, DNI, correo, telefono, estado, nombreUsuario, password, tipoRol);
	}

	
}
