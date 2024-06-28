package hard.trie.Q0212WordSearch;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testOne() {
        var board = new char[][] {
            {'o','a','a','n'},
            {'e','t','a','e'},
            {'i','h','k','r'},
            {'i','f','l','v'}
        };
        var words = new String[] {"oath","pea","eat","rain"};
        var actual = new Solution().findWords(board, words);
        assertEquals(Set.of("eat","oath"), new HashSet<>(actual));
    }

    @Test
    void testTwo() {
        var board = new char[][] {
            {'a','b'},
            {'c','d'}
        };
        var words = new String[] {"abcb"};
        var actual = new Solution().findWords(board, words);
        assertEquals(Set.of(), new HashSet<>(actual));
    }
}