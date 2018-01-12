import java.util.Objects;

class PasswordValidator {

    Boolean isValid(String password) {
        return hasUpperCase(password)
                && hasLowerCase(password)
                && hasUnderScore(password)
                && isLongEnough(password);
    }

    private boolean isLongEnough(String password) {
        return password.length() >= 9;
    }

    private boolean hasUnderScore(String password) {
        return password.indexOf('_') != -1;
    }

    private boolean hasLowerCase(String password) {
        return !Objects.equals(password.toUpperCase(), password);
    }

    private boolean hasUpperCase(String password) {
        return !Objects.equals(password.toLowerCase(), password);
    }
}

