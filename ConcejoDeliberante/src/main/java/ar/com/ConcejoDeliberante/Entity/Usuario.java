package ar.com.ConcejoDeliberante.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Usuario {
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	int id;

	private String nombre;
	private String apellido;
	private String DNI;
	private String correo;
	private String telefono;
	private boolean estado;
	
	@ManyToOne
	@JoinColumn(name="id_rol")
	private Rol tipoRol;
	
	
	public  Usuario () { 
		
	}


	


	public Usuario(int id, String nombre, String apellido, String DNI, String correo, String telefono,
			boolean estado, Rol tipoRol) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.DNI = DNI;
		this.correo = correo;
		this.telefono = telefono;
		this.estado = estado;
		this.tipoRol = tipoRol;
	}





	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDNI() {
		return DNI;
	}


	public void setDNI(String DNI) {
		this.DNI = DNI;
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
	


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public Rol getTipoRol() {
		return tipoRol;
	}


	public void setTipoRol(Rol tipoRol) {
		this.tipoRol = tipoRol;
	}
	
	
	
	
}

