package ar.com.ConcejoDeliberante.Service;

import java.util.List;

import ar.com.ConcejoDeliberante.Entity.Comision;

public interface IComision {
		void guardar (Comision c);
		List<Comision> comisiones ();
}
