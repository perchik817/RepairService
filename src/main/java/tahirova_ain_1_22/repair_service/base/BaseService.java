package tahirova_ain_1_22.repair_service.base;

import java.util.List;

public interface BaseService <E>{
    E save(E e);
    E findById(Long id);
    List<E> findAll();
    void delete(Long id);
    E update(E e);
}
