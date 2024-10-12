
package pe.com.sistemamoda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.sistemamoda.entity.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    @Query("select m from Categoria m where m.estado='1'")
    List<Categoria> findAllCustom();
    
    @Query(nativeQuery = true, value = "{call sP_BuscarXCategoria(:nombre)}")
    List<Categoria> findByName(@Param("nombre") String nombre);
    
    
}
