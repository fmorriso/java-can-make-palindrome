import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class UnitTests {

    @Test
    @DisplayName("abxa should be true")
    public void canCheck_abxa() {
        assertTrue(Main.canMakePalindrome("abxa"));
    }

    @Test
    @DisplayName("drpepper should be false")
    public void canCheck_drpepper() {
        assertFalse(Main.canMakePalindrome("drpepper"));
    }

    @Test
    @DisplayName("lsevels should be true")
    public void canCheck_lsevels() {
        assertTrue(Main.canMakePalindrome("lsevels"));
    }

    @Test
    @DisplayName( "rotrator should be true")
    public void canCheck_rotrator() {
        assertTrue(Main.canMakePalindrome("rotrator"));
    }

}
