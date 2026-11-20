package ar.com.ConcejoDeliberante.ServiceImple;


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

		Actividad actividadExistente = ActividadRepo.findById(Act.getId());
		
		if (actividadExistente != null) {
			actividadExistente.setFecha(Act.getFecha());
			actividadExistente.setHoraEntrada(Act.getHoraEntrada());
			actividadExistente.setHoraSalida(Act.getHoraSalida());
			actividadExistente.setEstado("Pospuesta");
			ActividadRepo.save(actividadExistente);
		}else {
			Act.setEstado("A realizar");
			ActividadRepo.save(Act);
		}
	}

	@Override
	public List<Actividad> listarActividadad() {

		return ActividadRepo.findAll();
	}

	@Override
	public Actividad porID(int id) {

		return ActividadRepo.findById(id);
	}

}
