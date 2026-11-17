package ar.com.ConcejoDeliberante.Service;

import java.util.List;

import ar.com.ConcejoDeliberante.Entity.TipoArchivo;

public interface ITipoArchivo {
	void guarda (TipoArchivo tipo);
	List<TipoArchivo> archivos();
}
