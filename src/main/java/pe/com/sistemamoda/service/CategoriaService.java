package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import pe.com.sistemamoda.entity.Categoria;

public interface CategoriaService {

    //Muestra todas las categorias
    public List<Categoria> findAll();

    //Muestra sólo los habilitados 
    public List<Categoria> findAllCustom();

    //Este permite buscar por codigo
    public Optional<Categoria> findById(long id);

    //Para Agregar 
    public Categoria add(Categoria m);

    //Para Actualizar
    public Categoria update(Categoria m);

    //Para Eliminar
    public Categoria delete(Categoria m);

    List<Categoria>findByName(Categoria m);
}
