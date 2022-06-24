package net.guides.springboot2.crud.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.guides.springboot2.crud.model.Codigo;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface CodigoRepository extends JpaRepository<Codigo, Long>{

    
    @Query(
    value = "SELECT * FROM TC_CODIGO P WHERE P.CODIGO = ?1 AND ESTADO = 1", 
    nativeQuery = true)
    List<Codigo> findByCodigo(String codigo);
    
}
