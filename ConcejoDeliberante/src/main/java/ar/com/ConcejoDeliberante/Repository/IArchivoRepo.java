package ar.com.ConcejoDeliberante.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ar.com.ConcejoDeliberante.Entity.Archivo;
import java.util.List;



@Repository
public interface IArchivoRepo extends JpaRepository<Archivo, Integer>{
	Archivo  findByIdArchivo(int idArchivo);
}

