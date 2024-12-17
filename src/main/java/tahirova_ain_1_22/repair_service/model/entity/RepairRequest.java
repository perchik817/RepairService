package tahirova_ain_1_22.repair_service.model.entity;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import tahirova_ain_1_22.repair_service.model.enums.Status;

import java.util.Date;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "repair_request")
public class RepairRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    Customer customer;
    @ManyToOne
    @JoinColumn(name = "technician_id", nullable = false)
    Technician technician;
    String description;
    @Enumerated(EnumType.STRING)
    Status status;
    Date createdAt;
    Date completedAt;
}
