package app.camisetas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.camisetas.model.Camiseta;

@Repository
public interface CamisetasRepository extends CrudRepository <Camiseta, Integer> {

}
