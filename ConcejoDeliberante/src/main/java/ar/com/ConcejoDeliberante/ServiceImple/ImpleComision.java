package ar.com.ConcejoDeliberante.ServiceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ConcejoDeliberante.Entity.Comision;
import ar.com.ConcejoDeliberante.Repository.IComisionRepo;
import ar.com.ConcejoDeliberante.Service.IComision;

@Service
public class ImpleComision implements IComision{

	@Autowired
	private IComisionRepo comisionRepo;
	
	@Override
	public void guardar(Comision c) {
		
		comisionRepo.save(c);
		
	}

	@Override
	public List<Comision> comisiones() {
		
		return comisionRepo.findAll();
	}

}
