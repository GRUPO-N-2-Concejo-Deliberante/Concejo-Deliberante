package ar.com.ConcejoDeliberante.Service;

import java.util.List;

import ar.com.ConcejoDeliberante.Entity.Concejal;

public interface IConcejal {
public void guarda(Concejal concejal);
public List<Concejal>concejales();
public Concejal buscar(String  DNI);
public void eliminarConcejal(int id);

}
