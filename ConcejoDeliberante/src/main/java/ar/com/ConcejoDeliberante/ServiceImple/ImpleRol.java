package ar.com.ConcejoDeliberante.ServiceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ConcejoDeliberante.Entity.Rol;
import ar.com.ConcejoDeliberante.Repository.IRolRepo;
import ar.com.ConcejoDeliberante.Service.IRol;
@Service
public class ImpleRol implements IRol {
	@Autowired
	private IRolRepo rolRepo;
	@Override
	public void guardar(Rol rol) {
		
		rolRepo.save(rol);
	}

	@Override
	public List<Rol> roles() {
		
		return rolRepo.findAll();
	}

}
