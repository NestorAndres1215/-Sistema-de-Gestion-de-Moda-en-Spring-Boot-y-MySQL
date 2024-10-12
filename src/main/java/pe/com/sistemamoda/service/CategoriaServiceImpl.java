package pe.com.sistemamoda.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.sistemamoda.entity.Categoria;
import pe.com.sistemamoda.repository.CategoriaRepository;



@Service
public class CategoriaServiceImpl implements CategoriaService{
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public List<Categoria> findAllCustom() {
        return categoriaRepository.findAllCustom();
    }

    @Override
    public Optional<Categoria> findById(long id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public Categoria add(Categoria m) {
        return categoriaRepository.save(m);
    }

    @Override
    public Categoria update(Categoria m) {
        Categoria objmarca=categoriaRepository.getById(m.getCodigo());
        BeanUtils.copyProperties(m, objmarca);
        return categoriaRepository.save(objmarca);
    }

    @Override
    public Categoria delete(Categoria m) {
        Categoria objmarca=categoriaRepository.getById(m.getCodigo());
        objmarca.setEstado(false);
        return categoriaRepository.save(objmarca);
    }

    @Override
    public List<Categoria> findByName(Categoria m) {
        List<Categoria> listacategoria = categoriaRepository.findByName(m.getNombre());
        return listacategoria; }
}
