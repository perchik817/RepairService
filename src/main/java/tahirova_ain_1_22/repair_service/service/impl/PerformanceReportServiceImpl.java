package tahirova_ain_1_22.repair_service.service.impl;

import org.springframework.stereotype.Service;
import tahirova_ain_1_22.repair_service.base.BaseServiceImpl;
import tahirova_ain_1_22.repair_service.dao.PerformanceReportRep;
import tahirova_ain_1_22.repair_service.model.entity.PerformanceReport;
import tahirova_ain_1_22.repair_service.service.PerformanceReportService;

@Service
public class PerformanceReportServiceImpl extends BaseServiceImpl<PerformanceReport, PerformanceReportRep> implements PerformanceReportService {
    protected PerformanceReportServiceImpl(PerformanceReportRep repo) {
        super(repo);
    }
}
