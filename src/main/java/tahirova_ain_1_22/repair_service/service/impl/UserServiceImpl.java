package tahirova_ain_1_22.repair_service.service.impl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import tahirova_ain_1_22.repair_service.base.BaseServiceImpl;
import tahirova_ain_1_22.repair_service.base.BaseUser;
import tahirova_ain_1_22.repair_service.dao.UserRep;
import tahirova_ain_1_22.repair_service.service.UserService;
import tahirova_ain_1_22.repair_service.utils.ResourceBundle;

import java.util.Optional;

@Service
public class UserServiceImpl extends BaseServiceImpl<BaseUser, UserRep> implements UserService {

    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRep repo, PasswordEncoder passwordEncoder) {
        super(repo);
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Optional<BaseUser> findByName(String userName) {
        return repo.findBaseUserByUserName(userName);
    }

    @Override
    public BaseUser register(BaseUser user) {
        Optional<BaseUser> existingUser = findByName(user.getName());
        if (existingUser.isPresent()) {
            throw new IllegalArgumentException(ResourceBundle.periodMess("nameAlreadyExists"));
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return repo.save(user);
    }

    @Override
    public boolean checkCredentials(String userName, String password) {
        return findByName(userName)
                .map(user -> passwordEncoder.matches(password, user.getPassword()))
                .orElse(false);
    }
}
