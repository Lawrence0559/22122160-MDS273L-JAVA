import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class lab_6 {

    public static void main(String[] args) {
        String filePath = "text.txt";
        String fileContent = getFileContent(filePath);

        Map<Character, Integer> vowelsCount = countVowels(fileContent);
        Map<Character, Integer> digitsCount = countDigits(fileContent);
        Map<String, Integer> topFiveWords = getTopNWords(fileContent, 5, true);
        Map<String, Integer> leastFiveWords = getTopNWords(fileContent, 5, false);
        Map<Character, Integer> topFiveChars = getTopNChars(fileContent, 5, true);
        Map<Character, Integer> leastFiveChars = getTopNChars(fileContent, 5, false);

        // print or use the results here
    }

    private static String getFileContent(String filePath) {
        StringBuilder fileContent = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                fileContent.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent.toString();
    }

    private static Map<Character, Integer> countVowels(String fileContent) {
        Map<Character, Integer> vowelsCount = new HashMap<>();
        // implementation here
        return vowelsCount;
    }

    private static Map<Character, Integer> countDigits(String fileContent) {
        Map<Character, Integer> digitsCount = new HashMap<>();
        // implementation here
        return digitsCount;
    }

    private static Map<String, Integer> getTopNWords(String fileContent, int n, boolean isDescending) {
        Map<String, Integer> wordCount = new HashMap<>();
        // implementation here
        return wordCount;
    }

    private static Map<Character, Integer> getTopNChars(String fileContent, int n, boolean isDescending) {
        Map<Character, Integer> charCount = new HashMap<>();
        // implementation here
        return charCount;
    }

    private static PriorityQueue<Map.Entry<String, Integer>> getTopNEntries(Map<String, Integer> wordCount, int n, boolean isDescending) {
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) -> {
            if (isDescending) {
                return b.getValue() - a.getValue();
            } else {
                return a.getValue() - b.getValue();
            }
        });
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            pq.offer(entry);
            if (pq.size() > n) {
                pq.poll();
            }
        }
        return pq;
    }
}

