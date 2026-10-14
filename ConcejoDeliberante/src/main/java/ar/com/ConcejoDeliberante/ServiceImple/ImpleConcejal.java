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
		conceRepo.save(concejal);
		
	}

	@Override
	public List<Concejal> concejales() {
		
		return conceRepo.findAll();
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
