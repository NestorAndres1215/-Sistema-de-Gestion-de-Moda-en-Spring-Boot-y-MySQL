package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import pe.com.sistemamoda.entity.DetalleVenta;


 public interface DetalleVentaService {
    //Muestra todas las categorias
    public List<DetalleVenta> findAll();

    //Este permite buscar por codigo
    public Optional<DetalleVenta> findById(long id);
    //Para Agregar 
    public DetalleVenta add(DetalleVenta dv);
    //Para Actualizar
    public DetalleVenta update(DetalleVenta dv);
    
    public List<DetalleVenta> findByPrecio(DetalleVenta dv);

}
