import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Sort Odds")
class KataTest {
    @Test
    void example1() {
        Assertions.assertTrue(compare(Kata.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }), new int[]{ 1, 3, 2, 8, 5, 4 }));
    }

    @Test
    void example2() {
        Assertions.assertTrue(compare(Kata.sortArray(new int[]{ 5, 3, 1, 8, 0 }), new int[]{ 1, 3, 5, 8, 0 }));
    }

    @Test
    void example3() {
        Assertions.assertTrue(compare(Kata.sortArray(new int[]{ }), new int[]{ }));
    }

    boolean compare(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
}