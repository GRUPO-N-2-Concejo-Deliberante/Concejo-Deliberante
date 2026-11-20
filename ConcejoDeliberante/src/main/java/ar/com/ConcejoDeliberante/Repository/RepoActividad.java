package ar.com.ConcejoDeliberante.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.ConcejoDeliberante.Entity.Actividad;
import java.util.List;


@Repository
public interface RepoActividad extends JpaRepository<Actividad, Integer>{
	
	Actividad findById(int id);;
}
