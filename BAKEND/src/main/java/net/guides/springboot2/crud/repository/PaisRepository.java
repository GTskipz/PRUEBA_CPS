package net.guides.springboot2.crud.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.guides.springboot2.crud.model.Pais;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface PaisRepository extends JpaRepository<Pais, Long>{

    @Query(
    value = "SELECT * FROM TC_PAIS P WHERE P.ID_REGION = ?1", 
    nativeQuery = true)
    List<Pais> findByRegion(long idRegion);
      
}
