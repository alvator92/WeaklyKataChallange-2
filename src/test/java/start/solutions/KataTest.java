package start.solutions;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    public static char BLOCK_CHAR = '*';
    public static char SPACE_CHAR = ' ';

    @Test
    public void basicTests() {
        assertEquals(String.join(",", "*"), String.join(",", buildTower(1)));
        assertEquals(String.join(",", " * ", "***"), String.join(",", buildTower(2)));
        assertEquals(String.join(",", "  *  ", " *** ", "*****"), String.join(",", buildTower(3)));
    }
    private String[] buildTower(int level) {
        Method method = null;
        try {
            method = Kata.class.getDeclaredMethod("towerBuilder", int.class);
        } catch (NoSuchMethodException ignore) {}

        try {
            if (method == null) {
                method = Kata.class.getDeclaredMethod("TowerBuilder", int.class);
            }
            return (String[]) method.invoke(null, level);
        } catch (Exception cause) {
            throw new RuntimeException(cause);
        }
    }
}