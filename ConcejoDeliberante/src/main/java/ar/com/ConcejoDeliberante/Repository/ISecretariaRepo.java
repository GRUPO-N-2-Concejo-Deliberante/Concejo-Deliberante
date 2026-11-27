package ar.com.ConcejoDeliberante.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.ConcejoDeliberante.Entity.Secretaria;
import java.util.List;


@Repository
public interface ISecretariaRepo extends JpaRepository<Secretaria, Integer>{
	Secretaria  findById(int id);
	Secretaria findByNombreUsuario(String nombreUsuario);
}
