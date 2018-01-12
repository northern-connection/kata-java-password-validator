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
	public void should_validate_a_correct_password() {
        String password = "Aa_123456";

        assertTrue(validator.validate(password));
	}

    @Test
    public void should_fail_when_no_capital_letter() {
        String password = "aa_123456";

        assertFalse(validator.validate(password));
    }

    @Test
    public void should_fail_when_no_lower_case() {
        String password = "AA_123456";

        assertFalse(validator.validate(password));
    }
}
