import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PasswordValidatorTest {

	@Test
	public void should_validate_a_correct_password() {
        String password = "Aa_123456";
        PasswordValidator validator = new PasswordValidator();

        assertTrue(validator.validate(password));
	}

}
