package test.java.com.michalhynek.fibonacci.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import main.java.com.michalhynek.fibonacci.util.NumberUtil;

import org.junit.Test;

public class NumberUtilTest {

    @Test
    public void testIsInteger_validInteger_returnsTrue() {
        assertTrue(NumberUtil.isInteger("1234"));
    }

    @Test
    public void testIsInteger_emptyString_returnsFalse() {
        assertFalse(NumberUtil.isInteger(""));
    }

    @Test
    public void testIsInteger_blankString_returnsFalse() {
        assertFalse(NumberUtil.isInteger("  "));
    }

    @Test
    public void testIsInteger_decimalNumber_returnsFalse() {
        assertFalse(NumberUtil.isInteger("1.234"));
    }

    @Test
    public void testIsInteger_integerWithLeadingPlusSign_returnsTrue() {
        assertTrue(NumberUtil.isInteger("+1234"));
    }

    @Test
    public void testIsInteger_integerWithLeadingMinusSign_returnsTrue() {
        assertTrue(NumberUtil.isInteger("-1"));
    }

    @Test
    public void testIsInteger_integerWithLeadingWhitespace_returnsFalse() {
        assertFalse(NumberUtil.isInteger(" 123"));
    }

    @Test
    public void testIsInteger_integerWithTrailingWhitespace_returnsFalse() {
        assertFalse(NumberUtil.isInteger("123 "));
    }
}
