package tahirova_ain_1_22.repair_service.service.impl;

import org.springframework.stereotype.Service;
import tahirova_ain_1_22.repair_service.base.BaseServiceImpl;
import tahirova_ain_1_22.repair_service.dao.PartRep;
import tahirova_ain_1_22.repair_service.model.entity.Part;
import tahirova_ain_1_22.repair_service.service.PartService;

@Service
public class PartServiceImpl extends BaseServiceImpl<Part, PartRep> implements PartService {
    protected PartServiceImpl(PartRep repo) {
        super(repo);
    }
}
