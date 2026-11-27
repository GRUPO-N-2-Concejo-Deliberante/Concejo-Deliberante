package ar.com.ConcejoDeliberante.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.ConcejoDeliberante.Entity.Asistencia;
import ar.com.ConcejoDeliberante.Entity.Concejal;

@Repository
public interface IAsistenciaRepo extends JpaRepository<Asistencia, Integer> {

}
