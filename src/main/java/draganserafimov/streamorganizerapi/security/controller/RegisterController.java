package draganserafimov.streamorganizerapi.security.controller;

import draganserafimov.streamorganizerapi.security.bean.RegisterBean;
import draganserafimov.streamorganizerapi.security.service.RegisterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class RegisterController {

    private RegisterService registerService;

    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @PostMapping("/register")
    public String register(@RequestBody @Valid RegisterBean registerBean) {
        // TODO check passwords if equals
        registerService.register(registerBean);
        return "ok";
    }
}
