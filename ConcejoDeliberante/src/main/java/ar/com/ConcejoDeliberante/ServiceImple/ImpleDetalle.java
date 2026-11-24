package ar.com.ConcejoDeliberante.ServiceImple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ConcejoDeliberante.Entity.Archivo;
import ar.com.ConcejoDeliberante.Entity.DetalleActividad;
import ar.com.ConcejoDeliberante.Entity.DetalleArchivo;
import ar.com.ConcejoDeliberante.Repository.IDetalleRepo;
import ar.com.ConcejoDeliberante.Repository.IRepoActividad;
import ar.com.ConcejoDeliberante.Service.IDetalle;
import ar.com.ConcejoDeliberante.Service.IDetalleArchivo;
import jakarta.transaction.Transactional;

@Service
public class ImpleDetalle implements IDetalle{
	
	
	@Autowired
	private IDetalleRepo detalleRepo;
	
	@Autowired
    IDetalleArchivo detalleArchivoImple;

	 @Override
	    public void generarDetalle(DetalleActividad detalle, Archivo archivo) {

	        DetalleActividad det =detalleRepo.findByActividad(detalle.getActividad());

	        if (det == null) {
	            detalleRepo.save(detalle);
	            det = detalle;
	        }
	        boolean existe = false;
	        for (DetalleArchivo da : det.getArchivos()) {
	            if (da.getArchivo().getIdArchivo() == archivo.getIdArchivo()) {
	                existe = true;
	                break;
	            }
	        }
	        if (!existe) {
	            DetalleArchivo da = new DetalleArchivo();
	            da.setDetalle(det);
	            da.setArchivo(archivo);
	            detalleArchivoImple.guardar(da);
	        }
	    }

	@Override
	public List<DetalleActividad> listarDetalle() {
		
		return detalleRepo.findAll();
	}

	@Override
	public DetalleActividad porID(int id) {
		
		return detalleRepo.findById(id);
	}

}
