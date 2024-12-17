package tahirova_ain_1_22.repair_service.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import tahirova_ain_1_22.repair_service.model.enums.Actor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "notification")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String message;
    @Enumerated(EnumType.STRING)
    Actor actor;
    @ManyToOne
    @JoinColumn(name = "request_id", nullable = false)
    RepairRequest repairRequest;
}
