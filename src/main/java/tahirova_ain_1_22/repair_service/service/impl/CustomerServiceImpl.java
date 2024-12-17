package tahirova_ain_1_22.repair_service.service.impl;

import org.springframework.stereotype.Service;
import tahirova_ain_1_22.repair_service.base.BaseServiceImpl;
import tahirova_ain_1_22.repair_service.dao.CustomerRep;
import tahirova_ain_1_22.repair_service.model.entity.Customer;
import tahirova_ain_1_22.repair_service.service.CustomerService;

@Service
public class CustomerServiceImpl extends BaseServiceImpl<Customer, CustomerRep> implements CustomerService {
    protected CustomerServiceImpl(CustomerRep repo) {
        super(repo);
    }
}
