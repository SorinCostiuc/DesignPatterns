package structuralDesigns.adaptorExample;

public class Main {
    public static void main(String[] args) {
        Mp4Video mp4Video = new Mp4Video();
        Mp3Player mp3Player = new PlayingAdaptor(mp4Video);
        mp3Player.playSong();
    }
}
