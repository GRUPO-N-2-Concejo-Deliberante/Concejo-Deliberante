package ar.com.ConcejoDeliberante.Service;

import java.util.List;

import ar.com.ConcejoDeliberante.Entity.Archivo;
import ar.com.ConcejoDeliberante.Entity.DetalleActividad;

public interface IDetalle {
	void generarDetalle(DetalleActividad detalle, Archivo archivo);
	List<DetalleActividad> listarDetalle();
	DetalleActividad porID(int id);
}
