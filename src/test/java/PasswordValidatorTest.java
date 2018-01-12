import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordValidatorTest {

	@Test
	public void should_validate_a_correct_password() {
        String password = "Aa_123456";
        PasswordValidator validator = new PasswordValidator();

        assertTrue(validator.validate(password));
	}

    @Test
    public void should_fail_when_no_capital_letter() {
        String password = "aa_123456";
        PasswordValidator validator = new PasswordValidator();

        assertFalse(validator.validate(password));
    }

}
