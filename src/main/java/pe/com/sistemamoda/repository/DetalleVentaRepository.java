
package pe.com.sistemamoda.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.com.sistemamoda.entity.DetalleVenta;



public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long>{

     @Query("select dt from DetalleVenta dt where dt.precio=:precio")
     List<DetalleVenta> findByPrecio(@Param("precio") double precio);
}
