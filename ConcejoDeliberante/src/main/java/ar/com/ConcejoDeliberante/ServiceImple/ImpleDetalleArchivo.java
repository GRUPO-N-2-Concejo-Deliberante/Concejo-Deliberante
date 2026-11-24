package ar.com.ConcejoDeliberante.ServiceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ConcejoDeliberante.Entity.DetalleArchivo;
import ar.com.ConcejoDeliberante.Repository.IDetalleArchivoRepo;
import ar.com.ConcejoDeliberante.Service.IDetalleArchivo;

@Service
public class ImpleDetalleArchivo implements IDetalleArchivo{

	@Autowired
    IDetalleArchivoRepo detalleArchivoRepo;

    @Override
    public void guardar(DetalleArchivo detalleArchivo) {

        detalleArchivoRepo.save(detalleArchivo);

    }

	@Override
	public List<DetalleArchivo> lista() {
		
		return detalleArchivoRepo.findAll();
	}

}
