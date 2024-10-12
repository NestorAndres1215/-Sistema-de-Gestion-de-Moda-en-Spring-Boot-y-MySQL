/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.sistemamoda.entity.Usuario;
import pe.com.sistemamoda.repository.UsuarioRepository;
@Service
public class UsuarioServiceImpl implements UsuarioService {
      @Autowired
    private UsuarioRepository repositorio;

    @Override
    public List<Usuario> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> findAllCustom() {
        return repositorio.findAllCustom();
    }

  
     @Override
    public List<Usuario> login(Usuario u) {
        return repositorio.login(u.getUsuario(), 
                u.getClave());
    }

    @Override
    public List<Usuario> finddAllUsuario(Usuario u) {
        List<Usuario> listausuario = repositorio.finddAllUsuario(u.getUsuario());
        return listausuario;  
    }
}
