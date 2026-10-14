package ar.com.ConcejoDeliberante.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.ConcejoDeliberante.Entity.Rol;

@Repository
public interface IRolRepo extends JpaRepository<Rol, Integer> {

}
