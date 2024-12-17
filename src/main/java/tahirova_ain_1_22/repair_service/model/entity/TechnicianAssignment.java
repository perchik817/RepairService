package tahirova_ain_1_22.repair_service.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "technician_assignment")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TechnicianAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name = "technician_id")
    Technician technician;
    @ManyToOne
    @JoinColumn(name = "request_id")
    RepairRequest repairRequest;
    Date assignedDate;
}
