package ar.com.ConcejoDeliberante.Service;

import ar.com.ConcejoDeliberante.Entity.Archivo;
import ar.com.ConcejoDeliberante.Entity.Comision;

import java.util.List;

public interface IArchivo {
void guardar (Archivo archivo);
List <Archivo> listar();

}

