package ar.com.ConcejoDeliberante.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.ConcejoDeliberante.Entity.TipoArchivo;

@Repository
public interface ITipoArchivoRepo extends JpaRepository<TipoArchivo, Integer>{

}
