import java.util.*;

public class EmotionDetector {
    private static final Map<String, String> keywordEmotionMap = new HashMap<>();

    static {
        keywordEmotionMap.put("happy", "Happy");
        keywordEmotionMap.put("excited", "Happy");
        keywordEmotionMap.put("joy", "Happy");
        keywordEmotionMap.put("sad", "Sad");
        keywordEmotionMap.put("depressed", "Sad");
        keywordEmotionMap.put("cry", "Sad");
        keywordEmotionMap.put("angry", "Angry");
        keywordEmotionMap.put("furious", "Angry");
        keywordEmotionMap.put("mad", "Angry");
        keywordEmotionMap.put("relaxed", "Calm");
        keywordEmotionMap.put("peaceful", "Calm");
        keywordEmotionMap.put("chill", "Calm");
    }

    public static String detectEmotion(String text) {
        text = text.toLowerCase();
        for (Map.Entry<String, String> entry : keywordEmotionMap.entrySet()) {
            if (text.contains(entry.getKey())) {
                return entry.getValue();
            }
        }
        return "Neutral";
    }
}
