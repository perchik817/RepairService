package tahirova_ain_1_22.repair_service.service;

import tahirova_ain_1_22.repair_service.base.BaseService;
import tahirova_ain_1_22.repair_service.base.BaseUser;

import java.util.Optional;

public interface UserService extends BaseService<BaseUser> {
    Optional<BaseUser> findByName(String name);
    BaseUser register(BaseUser baseUser);
    boolean checkCredentials(String userName, String password);
}
