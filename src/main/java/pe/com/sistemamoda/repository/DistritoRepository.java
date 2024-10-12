
package pe.com.sistemamoda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.sistemamoda.entity.Distrito;


public interface DistritoRepository extends JpaRepository<Distrito, Long>{
    @Query("select d from Distrito d where d.estado='1'")
    List<Distrito> findAllCustom();
    
    @Query(nativeQuery = true, value = "{call sP_BuscarXDistrito(:nombre)}")
    List<Distrito> findByName(@Param("nombre") String nombre);
}

