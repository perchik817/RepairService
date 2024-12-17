package tahirova_ain_1_22.repair_service.service.impl;

import org.springframework.stereotype.Service;
import tahirova_ain_1_22.repair_service.base.BaseServiceImpl;
import tahirova_ain_1_22.repair_service.dao.ManagerRep;
import tahirova_ain_1_22.repair_service.model.entity.Manager;
import tahirova_ain_1_22.repair_service.service.ManagerService;

@Service
public class ManagerServiceImpl extends BaseServiceImpl<Manager, ManagerRep> implements ManagerService {
    protected ManagerServiceImpl(ManagerRep repo) {
        super(repo);
    }
}
