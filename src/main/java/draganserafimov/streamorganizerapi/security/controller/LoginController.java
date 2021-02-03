package draganserafimov.streamorganizerapi.security.controller;

import draganserafimov.streamorganizerapi.security.bean.LoginBean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class LoginController {

    @PostMapping("/login")
    public String login(@Valid @RequestBody LoginBean loginBean) {
        // TODO handle login
        return "ok";
    }
}
