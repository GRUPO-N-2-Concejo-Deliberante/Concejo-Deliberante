package ar.com.ConcejoDeliberante.Service;

import java.util.List;

import ar.com.ConcejoDeliberante.Entity.Secretaria;

public interface ISecretaria {
	void guardar(Secretaria secretaria);
	List<Secretaria> lista ();
}
