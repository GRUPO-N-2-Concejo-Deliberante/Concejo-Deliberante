package ar.com.ConcejoDeliberante.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.ConcejoDeliberante.Entity.DetalleAsistencia;

@Repository
public interface IDetalleAsistenciaRepo extends JpaRepository<DetalleAsistencia, Integer> {

}
