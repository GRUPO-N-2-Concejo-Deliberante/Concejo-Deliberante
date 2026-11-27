package ar.com.ConcejoDeliberante.ServiceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ConcejoDeliberante.Entity.Asistencia;
import ar.com.ConcejoDeliberante.Repository.IAsistenciaRepo;
import ar.com.ConcejoDeliberante.Service.IAsistencia;

@Service
public class ImpleAsistencia implements IAsistencia {

	
	@Autowired
	IAsistenciaRepo AsistenciaService;
	
	
	
	@Override
	public void Registrarasistencia(Asistencia asistencia) {
		
	
		AsistenciaService.save(asistencia);
		
	}
	
	
	
}
