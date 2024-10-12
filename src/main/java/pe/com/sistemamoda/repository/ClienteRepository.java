
package pe.com.sistemamoda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.sistemamoda.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
  @Query("select cl from Cliente cl where cl.estado='1'")
    List<Cliente> findAllCustom();

    @Query("select cl from Cliente cl where cl.dni=:dni")
    List<Cliente> findByDni(@Param("dni") String dni);

    @Query(nativeQuery = true, value = "{call sP_BuscarXNombre(:nombre)}")
    List<Cliente> findByName(@Param("nombre") String nombre);

    @Query(nativeQuery = true, value = "{call sP_BuscarXApellido(:apellido)}")
    List<Cliente> findByLastName(@Param("apellido") String apellido);

  
}
