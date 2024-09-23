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
    @DisplayName("levels should be true")
    public void canCheck_levels() {
        assertTrue(Main.canMakePalindrome("levels"));
    }

    @Test
    @DisplayName( "protator should be true")
    public void canCheck_protator() {
        assertTrue(Main.canMakePalindrome("protator"));
    }

    @Test
    @DisplayName("raycecar should be true")
    public void canCheck_raycecar(){
        assertTrue(Main.canMakePalindrome("raycecar"));
    }

    @Test
    @DisplayName("kayazk should true")
    public void canCheck_kayazk() {
        assertTrue(Main.canMakePalindrome("kayazk"));
    }

    @Test
    @DisplayName("rotrator should be true")
    public void canCheck_rotrator(){
        assertTrue(Main.canMakePalindrome("rotrator"));
    }

}
