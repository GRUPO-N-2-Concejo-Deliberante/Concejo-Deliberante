package ar.com.ConcejoDeliberante.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class DetalleAsistencia {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

	  @ManyToOne
	    @JoinColumn(name = "id_asistencia")
	    Asistencia asistencia;

	    @ManyToOne
	    @JoinColumn(name = "id_concejal")
	    Concejal concejal;
	    @ManyToOne
		@JoinColumn(name ="id_actividad")
		Actividad actividad;
		
	    private boolean estado;

		public DetalleAsistencia() {
		}

		public DetalleAsistencia(int id, Asistencia asistencia, Concejal concejal, boolean estado) {
			super();
			this.id = id;
			this.asistencia = asistencia;
			this.concejal = concejal;
			this.estado = estado;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Asistencia getAsistencia() {
			return asistencia;
		}

		public void setAsistencia(Asistencia asistencia) {
			this.asistencia = asistencia;
		}

		public Concejal getConcejal() {
			return concejal;
		}

		public void setConcejal(Concejal concejal) {
			this.concejal = concejal;
		}

		public boolean isEstado() {
			return estado;
		}

		public void setEstado(boolean estado) {
			this.estado = estado;
		}

		
}
	    
	    
