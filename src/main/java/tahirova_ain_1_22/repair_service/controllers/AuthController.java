package tahirova_ain_1_22.repair_service.controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tahirova_ain_1_22.repair_service.base.BaseUser;
import tahirova_ain_1_22.repair_service.model.requests.LoginRequest;
import tahirova_ain_1_22.repair_service.service.UserService;
import tahirova_ain_1_22.repair_service.utils.ResourceBundle;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody BaseUser user) {
        try {
            BaseUser registeredUser = userService.register(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(registeredUser);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        boolean isAuthenticated = userService.checkCredentials(loginRequest.getUserName(), loginRequest.getPassword());
        if (isAuthenticated) {
            return ResponseEntity.ok(ResourceBundle.periodMess("login.success"));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(ResourceBundle.periodMess("login.fail"));
        }
    }


}
