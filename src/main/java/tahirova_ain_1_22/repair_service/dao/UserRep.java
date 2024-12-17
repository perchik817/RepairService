package tahirova_ain_1_22.repair_service.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tahirova_ain_1_22.repair_service.base.BaseRep;
import tahirova_ain_1_22.repair_service.base.BaseUser;

import java.util.Optional;

public interface UserRep extends BaseRep<BaseUser> {
    Optional<BaseUser> findBaseUserByUserName(@Param("userName") String userName);
}
