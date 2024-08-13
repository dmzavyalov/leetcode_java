package hard.graph.Q0127WordLadder;

import java.util.*;

/*

https://leetcode.com/problems/word-ladder/

 */

public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //Build the graph adjacency list
        //The key in the map is a pattern
        //The value is the list of words that match this pattern
        wordList.add(beginWord);
        Map<String, List<String>> adjList = new HashMap<>();
        for (String word : wordList) {  //For each word
            for (int i = 0; i < word.length(); i++) {   //For each character
                StringBuilder sb = new StringBuilder(word);
                sb.setCharAt(i, '*');   //We substitute it with asterisk to get a pattern. Like hit -> *it
                List<String> wl = adjList.getOrDefault(sb.toString(), new ArrayList<>());
                wl.add(word);
                adjList.put(sb.toString(), wl);
            }
        }

        //BFS
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        int result = 1; //beginning word is included in the path
        while (!queue.isEmpty()) {
            result++;
            int layerSize = queue.size();
            for (int i = 0; i < layerSize; i++) {   //Traverse the next layer. For each neighbour word
                String word = queue.poll();
                for (int j = 0; j < word.length(); j++) {   //Build all patterns that are applicable for the word
                    StringBuilder sb = new StringBuilder(word);
                    sb.setCharAt(j, '*');
                    for (String matchingWord: adjList.get(sb.toString())) {  //For the pattern get the words that match it
                        if (matchingWord.equals(endWord)) {
                            return result;  //Found the end word. It's BFS so the closest result to the beginning word will be found first
                        }
                        if (visited.contains(matchingWord)) {
                            continue;   //We've already visited this word, don't go back
                        }
                        queue.offer(matchingWord);
                        visited.add(matchingWord);
                    }
                }
            }
        }
        return 0;
    }
}
