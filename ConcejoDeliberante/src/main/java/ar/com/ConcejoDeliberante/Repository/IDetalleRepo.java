package ar.com.ConcejoDeliberante.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.ConcejoDeliberante.Entity.Actividad;
import ar.com.ConcejoDeliberante.Entity.DetalleActividad;
import java.util.List;


@Repository
public interface IDetalleRepo extends JpaRepository<DetalleActividad, Integer> {
	
	DetalleActividad  findById(int id);
	DetalleActividad  findByActividad(Actividad actividad);
}
