package ar.com.ConcejoDeliberante.ServiceImple;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ConcejoDeliberante.Entity.Concejal;
import ar.com.ConcejoDeliberante.Entity.Usuario;
import ar.com.ConcejoDeliberante.Repository.IConcejalRepo;
import ar.com.ConcejoDeliberante.Service.IConcejal;

@Service
public class ImpleConcejal implements IConcejal {

	@Autowired
	IConcejalRepo conceRepo;

	@Override
	public void guarda(Concejal concejal) {

		Concejal concejalExistente = conceRepo.findByDNI(concejal.getDNI());

	    if (concejalExistente != null) {
	        
	        concejalExistente.setNombre(concejal.getNombre());
	        concejalExistente.setApellido(concejal.getApellido());
	        concejalExistente.setCorreo(concejal.getCorreo());
	        concejalExistente.setTelefono(concejal.getTelefono());
	        concejalExistente.setTipoRol(concejal.getTipoRol());
	        
	        conceRepo.save(concejalExistente);
	       
	    } else {
	        
	        concejal.setEstado(true);
	        conceRepo.save(concejal);
	        System.out.println("Se guardó el nuevo concejal correctamente.");
	    }
	}
	

	@Override
	public List<Concejal> concejales() {

		return conceRepo.findAll();
	}

	@Override
	public void eliminarConcejal(int id) {

	}

	@Override
	public Concejal porDNI(String DNI) {

		return conceRepo.findByDNI(DNI);
	}

	@Override
	public void baja(Concejal concejal) {
		Concejal concejalExistente=porId(concejal.getId());
		if(concejalExistente.isEstado()) {
				concejalExistente.setEstado(false);
				conceRepo.save(concejalExistente);
		}else {
			concejalExistente.setEstado(true);
			conceRepo.save(concejalExistente);
		}
			}
		


	@Override
	public Concejal porId(int id) {
		
		return conceRepo.findByid(id);
	}

	

	}

