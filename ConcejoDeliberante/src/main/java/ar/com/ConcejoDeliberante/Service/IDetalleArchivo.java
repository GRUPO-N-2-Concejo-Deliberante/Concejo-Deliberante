package ar.com.ConcejoDeliberante.Service;

import java.util.List;

import ar.com.ConcejoDeliberante.Entity.DetalleArchivo;

public interface IDetalleArchivo {
	void guardar (DetalleArchivo detArchivo);
	List<DetalleArchivo> lista();
	void eliminar(int id);
}
