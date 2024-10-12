 package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.sistemamoda.entity.Cliente;
import pe.com.sistemamoda.repository.ClienteRepository;


@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public List<Cliente> findAllCustom() {
        return clienteRepository.findAllCustom();
    }

    @Override
    public Optional<Cliente> findById(long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente add(Cliente cl) {
        return clienteRepository.save(cl);
    }

    @Override
    public Cliente update(Cliente cl) {
        Cliente objcliente=clienteRepository.getById(cl.getCodigo());
        BeanUtils.copyProperties(cl, objcliente);
        return clienteRepository.save(objcliente);
    }

    @Override
    public Cliente delete(Cliente cl) {
        Cliente objcliente=clienteRepository.getById(cl.getCodigo());
        objcliente.setEstado(false);
        return clienteRepository.save(objcliente);
    }
      @Override
    public List<Cliente> findByDni(Cliente cl) {
        List<Cliente> listacliente = clienteRepository.findByDni(cl.getDni());
        return listacliente;
    }

    @Override
    public List<Cliente> findByName(Cliente cl) {
        List<Cliente> listacliente = clienteRepository.findByName(cl.getNombre());
        return listacliente;
    }

    @Override
    public List<Cliente> findByLastname(Cliente cl) {
        List<Cliente> listacliente = clienteRepository.findByLastName(cl.getApellido());
        return listacliente;
    }


}
