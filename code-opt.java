import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("apple");
        words.add("orange");
        words.add("banana");
        words.add("banana");

        Map<String, Integer> wordCount = new HashMap<>();
       for (String word : words) {
           int count = Collections.frequency(words, word);
           wordCount.put(word, count);
       }

        System.out.println(wordCount);
    }
}