package draganserafimov.streamorganizerapi.security.bean;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class RegisterBean implements Serializable {

    @NotBlank
    private String username;

    @NotBlank String email;

    @NotBlank
    private String password;

    @NotBlank
    private String repeatPassword;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }
}
