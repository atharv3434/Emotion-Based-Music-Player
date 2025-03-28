import java.io.File;
import java.util.Random;
import javax.sound.sampled.*;

public class MusicPlayer {
    private static final Map<String, String[]> moodPlaylists = new HashMap<>();

    static {
        moodPlaylists.put("Happy", new String[]{"playlist/happy1.wav", "playlist/happy2.wav"});
        moodPlaylists.put("Sad", new String[]{"playlist/sad1.wav", "playlist/sad2.wav"});
        moodPlaylists.put("Angry", new String[]{"playlist/angry1.wav", "playlist/angry2.wav"});
        moodPlaylists.put("Calm", new String[]{"playlist/calm1.wav", "playlist/calm2.wav"});
        moodPlaylists.put("Neutral", new String[]{"playlist/neutral1.wav", "playlist/neutral2.wav"});
    }

    public static void playMusic(String emotion) {
        try {
            String[] playlist = moodPlaylists.getOrDefault(emotion, moodPlaylists.get("Neutral"));
            String songPath = playlist[new Random().nextInt(playlist.length)];
            File musicFile = new File(songPath);

            if (!musicFile.exists()) {
                System.out.println("❌ No song found for this mood.");
                return;
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.println("🎶 Now Playing: " + songPath);
            Thread.sleep(clip.getMicrosecondLength() / 1000); // Wait for the song to finish
            clip.close();

        } catch (Exception e) {
            System.out.println("❌ Error playing music: " + e.getMessage());
        }
    }
}
