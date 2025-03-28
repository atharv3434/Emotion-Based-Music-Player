import java.util.Scanner;

public class EmotionMusicPlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🎭 AI-Powered Emotion-Based Music Player 🎵");

        while (true) {
            System.out.println("\n1. Enter Text to Detect Emotion");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("\nHow are you feeling? (Describe in a sentence): ");
                    String inputText = sc.nextLine();
                    String emotion = EmotionDetector.detectEmotion(inputText);
                    System.out.println("\n🤖 Detected Emotion: " + emotion);
                    MusicPlayer.playMusic(emotion);
                    break;
                case 2:
                    System.out.println("Exiting... Enjoy your music! 🎶");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
    }
}
