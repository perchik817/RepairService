package tahirova_ain_1_22.repair_service.service.impl;

import org.springframework.stereotype.Service;
import tahirova_ain_1_22.repair_service.base.BaseServiceImpl;
import tahirova_ain_1_22.repair_service.dao.InventoryRep;
import tahirova_ain_1_22.repair_service.model.entity.Inventory;
import tahirova_ain_1_22.repair_service.service.InventoryService;

@Service
public class InventoryServiceImpl extends BaseServiceImpl<Inventory, InventoryRep> implements InventoryService {
    protected InventoryServiceImpl(InventoryRep repo) {
        super(repo);
    }
}
