package tahirova_ain_1_22.repair_service.base;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController<E, S extends BaseService<E>> {
    protected final S service;

    protected BaseController(S service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<E> create(@RequestBody E entity) {
        return ResponseEntity.ok(service.save(entity));
    }

    @GetMapping("/{id}")
    public ResponseEntity<E> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<E>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PutMapping
    public ResponseEntity<E> update(@RequestBody E entity) {
        return ResponseEntity.ok(service.update(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
