/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.sistemamoda.entity.UsuarioRol;
import pe.com.sistemamoda.repository.UsuarioRolRepository;

@Service
public class UsuarioRolServiceImpl implements UsuarioRolService {

    @Autowired
    private UsuarioRolRepository repositorio;

    @Override
    public List<UsuarioRol> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<UsuarioRol> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<UsuarioRol> findById(long id) {
   return repositorio.findById(id);
    }

    @Override
    public UsuarioRol add(UsuarioRol ur) {
        return repositorio.save(ur);
    }

    @Override
    public UsuarioRol update(UsuarioRol ur) {
       return  repositorio.save(ur);
    }

    @Override
    public UsuarioRol delete(UsuarioRol ur) {
       UsuarioRol objur = repositorio.getById(ur.getCodigo());
       objur.setEstado(false);
       return repositorio.save(objur);
    }




}
