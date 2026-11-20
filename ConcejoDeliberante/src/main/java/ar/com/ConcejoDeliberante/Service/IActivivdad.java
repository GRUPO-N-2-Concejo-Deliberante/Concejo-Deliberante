
package ar.com.ConcejoDeliberante.Service;

import java.util.List;

import ar.com.ConcejoDeliberante.Entity.Actividad;

public interface IActivivdad {

	void guardarAct(Actividad Act);
	List<Actividad> listarActividadad();
	Actividad porID(int id);
	
}
