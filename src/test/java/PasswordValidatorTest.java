import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordValidatorTest {
    private PasswordValidator validator;

    @Before
    public void before() {
        validator = new PasswordValidator();
    }

    @Test
    public void valid_password() {
        assertTrue(validator.isValid("Aa_123456"));
    }

    @Test
    public void invalid_when_no_capital_letter() {
        assertFalse(validator.isValid("aa_123456"));
    }

    @Test
    public void invalid_when_no_lower_case_letter() {
        assertFalse(validator.isValid("AA_123456"));
    }

    @Test
    public void invalid_when_no_underscore_character() {
        assertFalse(validator.isValid("Aa0123456"));
    }

    @Test
    public void invalid_when_no_long_enough() {
        assertFalse(validator.isValid("Aa_12345"));
    }
}
