package ar.com.ConcejoDeliberante.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Usuario {
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	int id_Usuario;

	private String nombre;
	private String apellido;
	private String correo;
	private String telefono;
	
	@ManyToOne
	@JoinColumn(name="id_rol")
	private Rol tipoRol;
	
	
	public  Usuario () { 
		
	}


	public Usuario(String nombre, String apellido, String correo, String telefono, Rol tipoRol) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.telefono = telefono;
		this.tipoRol = tipoRol;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public Rol getTipoRol() {
		return tipoRol;
	}


	public void setTipoRol(Rol tipoRol) {
		this.tipoRol = tipoRol;
	}
	
	
	
	
}

