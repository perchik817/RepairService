package tahirova_ain_1_22.repair_service.base;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Data
@MappedSuperclass
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class BaseUser {
    @Column(unique = true, nullable = false)
    String name;
    @Column(nullable = false)
    String password;
    @Column (unique = true)
    String userName;


}
