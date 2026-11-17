package ar.com.ConcejoDeliberante.Service;

import java.util.List;


import ar.com.ConcejoDeliberante.Entity.TipoArchivo;

public interface ITipoArchivo {

	void guardar(TipoArchivo tipoArchivo);
	
	public List<TipoArchivo> tiposArchivos();

}

