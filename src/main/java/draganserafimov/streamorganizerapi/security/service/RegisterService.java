package draganserafimov.streamorganizerapi.security.service;

import draganserafimov.streamorganizerapi.security.bean.RegisterBean;
import draganserafimov.streamorganizerapi.security.entity.User;
import draganserafimov.streamorganizerapi.security.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    private UserRepository userRepository;

    public RegisterService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void register(RegisterBean registerBean) {
        // TODO store passwords in a safe way

        User user = new User(registerBean.getUsername(), registerBean.getEmail(), registerBean.getPassword());
        userRepository.save(user);
    }
}
