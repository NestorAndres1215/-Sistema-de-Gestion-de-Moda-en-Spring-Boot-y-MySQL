package pe.com.sistemamoda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.sistemamoda.entity.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {

    @Query("select r from Rol r where r.estado='1'")
    List<Rol> findAllCustom();

    @Query(nativeQuery = true, value = "{call sP_BuscarXRol(:rol)}")
    List<Rol> findByName(@Param("rol") String rol);
}
