public class PasswordValidator {
    public Boolean validate(String password) {
        return password.toLowerCase() != password;
    }
}

