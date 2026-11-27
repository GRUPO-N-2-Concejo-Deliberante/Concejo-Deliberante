package ar.com.ConcejoDeliberante.Service;

import java.util.List;

import ar.com.ConcejoDeliberante.Entity.Concejal;
import ar.com.ConcejoDeliberante.Entity.DetalleAsistencia;

public interface IDetalleAsistencia {

	void guardarAsistencia(DetalleAsistencia detAsistencia, Concejal  concejal );
	List<DetalleAsistencia> listarAsistencia ();
	 public DetalleAsistencia porID(int id); 
}
