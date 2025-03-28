# Emotion-Based-Music-Player


AI-Powered Emotion-Based Music Player 
A console-based music player that detects the user's emotion from text input and plays a suitable song accordingly. This project is built entirely in Java using sentiment analysis for emotion detection.

📌 Key Features
✔ User Inputs a Sentence, AI Detects Emotion 😃😢😠😌
✔ Plays a Song Matching the Mood 🎵
✔ Uses NLP for Sentiment Analysis 🧠
✔ Manages Playlist Based on Mood Categories 🎶
✔ Fully Offline, Works Without Internet 🚀

📂 Project Structure

EmotionMusicPlayer/
│── EmotionMusicPlayer.java   (Main Application)
│── EmotionDetector.java      (Detects Emotion)
│── MusicPlayer.java          (Plays Songs Based on Emotion)
│── playlist/                 (Folder containing MP3 songs)



Song File Format
The application uses .wav files for playback.

You need to store your songs in the /playlist/ folder with names like:

happy1.wav, happy2.wav

sad1.wav, sad2.wav

angry1.wav, angry2.wav

calm1.wav, calm2.wav

neutral1.wav, neutral2.wav



🎯 How It Works?
User Inputs a Sentence ✍️

Example: "I am feeling so happy today!"

AI Detects the Emotion 🎭

Example Output: "🤖 Detected Emotion: Happy"

Music Player Picks a Song for That Mood 🎵

Example Output: "🎶 Now Playing: happy1.wav"

Plays Music Using Java Sound API 🔊



🚀 How to Run?
Prepare .wav Music Files in the /playlist/ folder.

Compile: javac *.java

Run: java EmotionMusicPlayer

Enter a Sentence & Enjoy AI-Picked Songs! 🎧


