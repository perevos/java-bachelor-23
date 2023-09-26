package lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem1Tests {

    @Test
    void shouldReturnTrue_ifNumberContainsAInHexRepresentation() {
        // given
        int number = 10;

        // when
        boolean actual = Problem1.containsDigitAInHexadecimalRepresentation(number);

        // then
        assertTrue(actual);
    }

    @Test
    void shouldReturnFalse_ifNumberDoesNotContainAInHexRepresentation() {
        // given
        int number = 9;

        // when
        boolean actual = Problem1.containsDigitAInHexadecimalRepresentation(number);

        // then
        assertFalse(actual);
    }

}
