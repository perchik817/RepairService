package tahirova_ain_1_22.repair_service.model.requests;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginRequest {
    String userName;
    String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
