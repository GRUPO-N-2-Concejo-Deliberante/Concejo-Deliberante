package ar.com.ConcejoDeliberante.ServiceImple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ConcejoDeliberante.Entity.Concejal;
import ar.com.ConcejoDeliberante.Entity.Usuario;
import ar.com.ConcejoDeliberante.Repository.IConcejalRepo;
import ar.com.ConcejoDeliberante.Service.IConcejal;
@Service
public class ImpleConcejal implements IConcejal{
List<Concejal>LIstaConcejal=new ArrayList<>();

@Autowired
private IConcejalRepo conceRepo;


	@Override
	public void guarda(Concejal concejal) {
		Boolean encontrado=true;
		for(Concejal c:LIstaConcejal) {
			if (c.getDNI().equalsIgnoreCase(concejal.getDNI())) {
				c.setNombre(concejal.getNombre());
				c.setApellido(concejal.getApellido());
				c.setDNI(concejal.getDNI());
				c.setCorreo(concejal.getCorreo());
				c.setTelefono(concejal.getTelefono());
				c.setTipoRol(concejal.getTipoRol());
				encontrado=false;
					
			}
		
		}
		if (encontrado==false) {
			LIstaConcejal.add(concejal);
		conceRepo.save(concejal);
		}
		
	}

	@Override
	public List<Concejal> concejales() {
		
		return LIstaConcejal;
	}

	@Override
	public void eliminarConcejal(int id) {
		for (int i = 0; i < LIstaConcejal.size(); i++) {
			if ( LIstaConcejal.get(i).getId_Usuario()==id) {
				 LIstaConcejal.remove(i);
			}
			
		}
		
	}

	@Override
	public Concejal buscar(String DNI) {
		for(Concejal lista:LIstaConcejal) {
			if (lista.getDNI().equalsIgnoreCase(DNI)) {
				return lista;
			}
		
		}
		return null;
	}
	
}
