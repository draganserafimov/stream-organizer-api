package draganserafimov.streamorganizerapi.security.bean;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class LoginBean implements Serializable {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
