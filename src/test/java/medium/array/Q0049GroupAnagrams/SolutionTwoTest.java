package medium.array.Q0049GroupAnagrams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTwoTest {
    @Test
    void testOne() {
        String[] input = new String[] {"eat","tea","tan","ate","nat","bat"};
        var solution = new SolutionTwo();
        var actual = solution.groupAnagrams(input);
        List<List<String>> expected = List.of(
            List.of("eat","tea", "ate"),
            List.of("tan", "nat"),
            List.of("bat")
        );
        assertEquals(expected, actual);
    }

    @Test
    void testTwo() {
        String[] input = new String[] {""};
        var solution = new SolutionTwo();
        var actual = solution.groupAnagrams(input);
        List<List<String>> expected = List.of(
            List.of("")
        );
        assertEquals(expected, actual);
    }

    @Test
    void testThree() {
        String[] input = new String[] {"a"};
        var solution = new SolutionTwo();
        var actual = solution.groupAnagrams(input);
        List<List<String>> expected = List.of(
            List.of("a")
        );
        assertEquals(expected, actual);
    }
}
