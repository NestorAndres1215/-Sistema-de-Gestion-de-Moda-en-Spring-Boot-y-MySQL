package pe.com.sistemamoda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.com.sistemamoda.entity.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

    @Query("select e from Empleado e where e.estado='1'")
    List<Empleado> findAllCustom();

    @Query("select e from Empleado e where e.dni=:dni")
    List<Empleado> findByDni(@Param("dni") String dni);

    @Query(nativeQuery = true, value = "{call sP_BuscarXNombreEmp(:nombre)}")
    List<Empleado> findByName(@Param("nombre") String nombre);

    @Query(nativeQuery = true, value = "{call SP_BuscarXApellidoEmp(:apellido)}")
    List<Empleado> findByLastName(@Param("apellido") String apellido);

}
