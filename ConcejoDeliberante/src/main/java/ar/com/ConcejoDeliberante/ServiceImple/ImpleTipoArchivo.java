package ar.com.ConcejoDeliberante.ServiceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ConcejoDeliberante.Entity.TipoArchivo;
import ar.com.ConcejoDeliberante.Repository.ITipoArchivoRepo;
import ar.com.ConcejoDeliberante.Service.ITipoArchivo;



@Service
public class ImpleTipoArchivo implements ITipoArchivo{
	@Autowired
	private ITipoArchivoRepo tipoArchivoRepo;
	@Override
	public void guardar(TipoArchivo tipoArchivo) {
		
		tipoArchivoRepo.save(tipoArchivo);
	}

	@Override
	public List<TipoArchivo> tiposArchivos() {
		
		return tipoArchivoRepo.findAll();
	}

}
