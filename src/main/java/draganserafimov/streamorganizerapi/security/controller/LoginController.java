package draganserafimov.streamorganizerapi.security.controller;

import draganserafimov.streamorganizerapi.security.bean.LoginBean;
import draganserafimov.streamorganizerapi.security.entity.User;
import draganserafimov.streamorganizerapi.security.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class LoginController {

    private final UserRepository userRepository;

    public LoginController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/login")
    public String login(@Valid @RequestBody LoginBean loginBean) {
        // TODO handle login

        User user = new User(loginBean.getUsername());
        userRepository.save(user);
        return "ok";
    }
}
