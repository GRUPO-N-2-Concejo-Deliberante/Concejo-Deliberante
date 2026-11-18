package ar.com.ConcejoDeliberante.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.ConcejoDeliberante.Entity.Comision;

@Repository
public interface IComisionRepo extends JpaRepository<Comision, Integer> {

}
