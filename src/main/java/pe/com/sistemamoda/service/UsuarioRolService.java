
package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import pe.com.sistemamoda.entity.UsuarioRol;

public interface UsuarioRolService {

    public List<UsuarioRol> findAll();

    public List<UsuarioRol> findAllCustom();

    public Optional<UsuarioRol> findById(long id);

    public UsuarioRol add(UsuarioRol ur);

    public UsuarioRol update(UsuarioRol ur);

    public UsuarioRol delete(UsuarioRol ur);
}
