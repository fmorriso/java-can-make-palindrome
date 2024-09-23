import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//import  org.junit.jupiter.api.Assertions.assertTrue;


public class UnitTests {

    @Test
    @DisplayName("madam should be true")
    public void canCheck_madam() {
        Assertions.assertTrue(Main.canMakePalindrome("madam"));
    }

    @Test
    @DisplayName("racecar should be true")
    public void canCheck_racecar() {
        Assertions.assertTrue(Main.canMakePalindrome("racecar"));
    }

    @Test
    @DisplayName("abba should be true")
    public void canCheck_abba() {
        Assertions.assertTrue(Main.canMakePalindrome("abba"));
    }

    @Test
    @DisplayName("doggod should be true")
    public void canCheck_doggod() {
        Assertions.assertTrue(Main.canMakePalindrome("doggod"));
    }

    @Test
    @DisplayName("x should be true")
    public void canCheck_x() {
        Assertions.assertTrue(Main.canMakePalindrome("x"));
    }

    @Test
    @DisplayName("raycecar should be true")
    public void canCheck_raycecar() {
        Assertions.assertTrue(Main.canMakePalindrome("raycecar"));
    }

    @Test
    @DisplayName("abxa should be true")
    public void canCheck_abxa() {
        Assertions.assertTrue(Main.canMakePalindrome("abxa"));
    }


    @Test
    @DisplayName("kayazk should true")
    public void canCheck_kayazk() {
        Assertions.assertTrue(Main.canMakePalindrome("kayazk"));
    }

    @Test
    @DisplayName("levels should be true")
    public void canCheck_levels() {
        Assertions.assertTrue(Main.canMakePalindrome("levels"));
    }

    @Test
    @DisplayName("protator should be true")
    public void canCheck_protator() {
        Assertions.assertTrue(Main.canMakePalindrome("protator"));
    }

    @Test
    @DisplayName("rotrator minus middle r should be true")
    // rotrator - middle 'r' => rot a tor
    public void canCheck_rotrator() {
        Assertions.assertTrue(Main.canMakePalindrome("rotrator"));
    }


    @Test
    @DisplayName("pretend should be true")
    public void canCheck_pretend() {
        Assertions.assertTrue(Main.canMakePalindrome("pretend"));
    }


    @Test
    @DisplayName("racecor should be true")
    public void canCheck_racecor() {
        Assertions.assertTrue(Main.canMakePalindrome("racecor"));
    }

    @Test
    @DisplayName("pacecar should be true")
    public void canCheck_pacecar() {
        Assertions.assertTrue(Main.canMakePalindrome("pacecar"));
    }


    @Test
    @DisplayName("drpepper should be false")
    public void canCheck_drpepper() {
        Assertions.assertFalse(Main.canMakePalindrome("drpepper"));
    }

    @Test
    @DisplayName("krayzak should be true")
    public void canCheck_krayzak() {
        Assertions.assertTrue(Main.canMakePalindrome("krayzak"));
    }

    @Test
    @DisplayName("lslevels should be true")
    public void canCheck_lslevels() {
        Assertions.assertTrue(Main.canMakePalindrome("lslevels"));
    }

    @Test
    @DisplayName("xxy should be true")
    public void canCheck_xxy() {
        Assertions.assertTrue(Main.canMakePalindrome("xxy"));
    }

    @Test
    @DisplayName("xyz should be false")
    public void canCheck_xyy() {
        Assertions.assertFalse(Main.canMakePalindrome("xyz"));
    }


    @Test
    @DisplayName("xy should be true")
    public void canCheck_xy() {
        Assertions.assertTrue(Main.canMakePalindrome("xy"));
    }


    @Test
    @DisplayName("banana should be true")
    public void canCheck_banana() {
        Assertions.assertTrue(Main.canMakePalindrome("banana"));
    }

    @Test
    @DisplayName("z should be true")
    public void canCheck_z() {
        Assertions.assertTrue(Main.canMakePalindrome("z"));
    }

    @Test
    @DisplayName("empty string should be true")
    public void canCheck_empty_string() {
        Assertions.assertTrue(Main.canMakePalindrome(""));
    }



}
