package ar.com.ConcejoDeliberante.ServiceImple;

import ar.com.ConcejoDeliberante.Repository.IArchivoRepo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ConcejoDeliberante.Entity.Actividad;
import ar.com.ConcejoDeliberante.Repository.RepoActividad;
import ar.com.ConcejoDeliberante.Service.IActivivdad;

@Service
public class ImpleActividad implements IActivivdad {

	@Autowired 
	private RepoActividad ActividadRepo;
	
	
	@Override
	public void guardarAct(Actividad Act) {
		
	ActividadRepo.save(Act);
		
		
	}

	@Override
	public List<Actividad> listarActividadad() {
	
		return ActividadRepo.findAll();
	}

}
