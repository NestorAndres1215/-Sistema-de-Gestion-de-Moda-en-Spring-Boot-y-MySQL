/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import pe.com.sistemamoda.entity.Distrito;


public interface DistritoService {
        //Muestra todas las categorias
    public List<Distrito> findAll();
    //Muestra sólo los habilitados 
    public List<Distrito> findAllCustom();
    //Este permite buscar por codigo
    public Optional<Distrito> findById(long id);
    //Para Agregar 
    public Distrito add(Distrito d);
    //Para Actualizar
    public Distrito update(Distrito d);
    //Para Eliminar
    public Distrito delete(Distrito d);
    
   public List<Distrito>  findByName(Distrito d);
}
