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

	public Secretaria(int id_Usuario,String nombre, String apellido,String DNI, String correo, String telefono, Rol tipoRol) {
		super( id_Usuario, nombre, apellido, correo, telefono, DNI, tipoRol);
		// TODO Auto-generated constructor stub
	}

	
	
}
