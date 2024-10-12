/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.sistemamoda.entity.Distrito;
import pe.com.sistemamoda.repository.DistritoRepository;

@Service
public class DistritoServiceImpl implements DistritoService {

    @Autowired
    private DistritoRepository distritoRepository;

    @Override
    public List<Distrito> findAll() {
        return distritoRepository.findAll();
    }

    @Override
    public List<Distrito> findAllCustom() {
        return distritoRepository.findAllCustom();
    }

    @Override
    public Optional<Distrito> findById(long id) {
        return distritoRepository.findById(id);
    }

    @Override
    public Distrito add(Distrito d) {
        return distritoRepository.save(d);
    }

    @Override
    public Distrito update(Distrito d) {
        Distrito objdistrito = distritoRepository.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objdistrito);
        return distritoRepository.save(objdistrito);
    }

    @Override
    public Distrito delete(Distrito d) {
        Distrito objdistrito = distritoRepository.getById(d.getCodigo());
        objdistrito.setEstado(false);
        return distritoRepository.save(objdistrito);
    }

    @Override
     public List<Distrito>  findByName(Distrito d) {
        List<Distrito> listadistrito = distritoRepository.findByName(d.getNombre());
        return listadistrito;
    }
}


