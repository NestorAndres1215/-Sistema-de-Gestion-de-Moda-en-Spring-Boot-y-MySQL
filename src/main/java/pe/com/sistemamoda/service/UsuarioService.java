package pe.com.sistemamoda.service;

import java.util.List;

import pe.com.sistemamoda.entity.Usuario;

public interface UsuarioService {

    public List<Usuario> findAll();

    public List<Usuario> findAllCustom();

    public List<Usuario> login(Usuario u);
    public List<Usuario> finddAllUsuario(Usuario u);
}
