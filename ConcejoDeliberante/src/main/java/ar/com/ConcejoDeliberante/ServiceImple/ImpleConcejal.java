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

		List<Concejal> concejales = conceRepo.findAll();
		boolean encontrado = true;;
System.out.println("este es el concejal que apaece en implementacion"+concejal);
		for (Concejal c : concejales) {
			if (concejal.getDNI().equalsIgnoreCase(c.getDNI())) {
				encontrado =false;
				break;
			}
		}
		
		for (Concejal c : concejales) {
			if (c.getDNI().equalsIgnoreCase(concejal.getDNI())) {
				encontrado = true;
				c.setNombre(concejal.getNombre());
				c.setApellido(concejal.getApellido());
				c.setDNI(concejal.getDNI());
				c.setCorreo(concejal.getCorreo());
				c.setTelefono(concejal.getTelefono());
				c.setTipoRol(concejal.getTipoRol());
				conceRepo.save(c);
			}
		}
		if (encontrado) {
			for (Concejal c : concejales) {
				if (c.getDNI().equalsIgnoreCase(concejal.getDNI())) {
					encontrado = true;
					c.setNombre(concejal.getNombre());
					c.setApellido(concejal.getApellido());
					c.setDNI(concejal.getDNI());
					c.setCorreo(concejal.getCorreo());
					c.setTelefono(concejal.getTelefono());
					c.setTipoRol(concejal.getTipoRol());
					conceRepo.save(c);
				} else {
						concejal.setEstado(true);
						conceRepo.save(concejal);
						System.out.println("si se guarda al parecer el concejal");
				}
			}
			
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
		if(concejal.isEstado()==true) {
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

