package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import pe.com.sistemamoda.entity.Cliente;


public interface ClienteService {
    public List<Cliente> findAll();

    public List<Cliente> findAllCustom();

    public Optional<Cliente> findById(long id);

    public Cliente add(Cliente cl);

    public Cliente update(Cliente cl);

    public Cliente delete(Cliente cl);
    
    public List<Cliente> findByDni(Cliente cl);
    
    public List<Cliente> findByName(Cliente cl);
    
    public List<Cliente>findByLastname(Cliente cl);
    
  
}
