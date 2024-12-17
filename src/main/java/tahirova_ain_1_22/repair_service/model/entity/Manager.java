package tahirova_ain_1_22.repair_service.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import tahirova_ain_1_22.repair_service.base.BaseUser;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "manager")
public class Manager extends BaseUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
}
