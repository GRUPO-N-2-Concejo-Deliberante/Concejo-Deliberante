package ar.com.ConcejoDeliberante.ServiceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ConcejoDeliberante.Entity.Archivo;
import ar.com.ConcejoDeliberante.Entity.Comision;
import ar.com.ConcejoDeliberante.Entity.Concejal;
import ar.com.ConcejoDeliberante.Repository.IArchivoRepo;
import ar.com.ConcejoDeliberante.Service.IArchivo;

import java.util.List;


@Service
public class ImpleArchivo implements IArchivo{
	
	
	@Autowired 
	IArchivoRepo archivoRepo;
	
	@Override
	public void guardar (Archivo archivo) {
		
		archivo.setEstado("Pendiente");
		
		archivoRepo.save(archivo);
		
	}

	@Override
	public List <Archivo> listar (){
		
		return archivoRepo.findAll();
	}

	
}
