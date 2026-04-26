
import java.util.HashMap;

public class countWordsTask1 {
    public static void main(String[] args) {
        String sentence = "the cat and the dog and the bird";
        String[] words = sentence.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}
