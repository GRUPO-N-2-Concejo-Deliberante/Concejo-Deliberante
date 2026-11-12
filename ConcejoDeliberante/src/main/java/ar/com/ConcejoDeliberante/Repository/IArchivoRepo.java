package ar.com.ConcejoDeliberante.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ar.com.ConcejoDeliberante.Entity.Archivo;


@Repository
public interface IArchivoRepo extends JpaRepository<Archivo, Integer>{
	
}

