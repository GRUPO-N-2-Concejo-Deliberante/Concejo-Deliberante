package ar.com.ConcejoDeliberante.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Asistencia {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id_asistencia;
	
	@OneToMany
	@JoinColumn(name="id_concejal")
	@JoinColumn(name="id_actividad")
	
	Actividad actividad;
	Concejal concejal;
}
