package ar.com.ConcejoDeliberante.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.ConcejoDeliberante.Entity.Concejal;

@Repository
public interface IConcejalRepo extends JpaRepository<Concejal, Integer> {

}
