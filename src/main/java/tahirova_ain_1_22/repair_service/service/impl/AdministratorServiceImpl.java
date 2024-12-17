package tahirova_ain_1_22.repair_service.service.impl;

import org.springframework.stereotype.Service;
import tahirova_ain_1_22.repair_service.base.BaseServiceImpl;
import tahirova_ain_1_22.repair_service.dao.AdministratorRep;
import tahirova_ain_1_22.repair_service.model.entity.Administrator;
import tahirova_ain_1_22.repair_service.service.AdministratorService;

import java.util.List;

@Service
public class AdministratorServiceImpl extends BaseServiceImpl<Administrator, AdministratorRep> implements AdministratorService {
    protected AdministratorServiceImpl(AdministratorRep repo) {
        super(repo);
    }
}
