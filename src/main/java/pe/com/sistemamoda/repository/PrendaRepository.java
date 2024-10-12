package pe.com.sistemamoda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.sistemamoda.entity.Prenda;

public interface PrendaRepository extends JpaRepository<Prenda, Long> {

    @Query("select p from Prenda p where p.estado='1'")
    List<Prenda> findAllCustom();

    @Query(nativeQuery = true, value = "{call sP_BuscarXPrenda(:descripcion)}")
    Prenda findByName(@Param("descripcion") String descripcion);

   @Query(nativeQuery = true, value = "{call sP_BuscarXTalla(:talla)}")
     List<Prenda>  findByTalla(@Param("talla") String talla);

    @Query("select p from Prenda p where p.precio=:precio")
   List<Prenda>  findByPrecio(@Param("precio") double precio);
}
