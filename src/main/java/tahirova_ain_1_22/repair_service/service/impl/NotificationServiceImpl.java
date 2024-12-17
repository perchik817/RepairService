package tahirova_ain_1_22.repair_service.service.impl;

import org.springframework.stereotype.Service;
import tahirova_ain_1_22.repair_service.base.BaseServiceImpl;
import tahirova_ain_1_22.repair_service.dao.NotificationRep;
import tahirova_ain_1_22.repair_service.model.entity.Notification;
import tahirova_ain_1_22.repair_service.service.NotificationService;

@Service
public class NotificationServiceImpl extends BaseServiceImpl<Notification, NotificationRep> implements NotificationService {
    protected NotificationServiceImpl(NotificationRep repo) {
        super(repo);
    }
}
