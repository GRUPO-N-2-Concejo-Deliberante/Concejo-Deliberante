package ar.com.ConcejoDeliberante.Service;

import java.util.List;

import ar.com.ConcejoDeliberante.Entity.Concejal;

public interface IConcejal {

	void guarda(Concejal concejal);

	 List<Concejal> concejales();

	Concejal porDNI(String DNI);

	 void eliminarConcejal(int id);
	 void baja(Concejal concejal);
	 Concejal porId(int id);

}
