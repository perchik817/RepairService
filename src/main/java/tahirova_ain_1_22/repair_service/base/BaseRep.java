package tahirova_ain_1_22.repair_service.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface BaseRep<E> extends JpaRepository<E, Long> {
    @Override
    Optional<E> findById(Long aLong);

}
