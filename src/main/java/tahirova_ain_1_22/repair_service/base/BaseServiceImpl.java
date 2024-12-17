package tahirova_ain_1_22.repair_service.base;

import jakarta.persistence.MappedSuperclass;
import tahirova_ain_1_22.repair_service.utils.ResourceBundle;

import java.util.List;

@MappedSuperclass
public class BaseServiceImpl <E, R extends BaseRep<E>> implements BaseService<E>{
    protected final R repo;

    protected BaseServiceImpl(R repo) {
        this.repo = repo;
    }

    @Override
    public E save(E e) {
        return repo.save(e);
    }

    @Override
    public E findById(Long id) {
        return repo.findById(id).orElseThrow(()->new RuntimeException(ResourceBundle.periodMess("idNotFound")));
    }

    @Override
    public List<E> findAll() {
        return repo.findAll();
    }

    @Override
    public void delete(Long id) {
        if (findById(id) != null) repo.deleteById(id);
        else throw new RuntimeException(ResourceBundle.periodMess("idNotFound"));
    }

    @Override
    public E update(E e) {
        return save(e);
    }
}
