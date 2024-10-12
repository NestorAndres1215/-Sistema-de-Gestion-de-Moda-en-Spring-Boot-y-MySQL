
package pe.com.sistemamoda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.sistemamoda.entity.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long>{
    @Query("select v from Venta v where v.estado='1'")
    List<Venta> findAllCustom();
    
    @Query ("select v from Venta v Where v.fecha=:fecha")
     List<Venta> findAllFecha(@Param("fecha") String fecha);
    
}
