package structuralDesigns.adaptorExample;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class PlayingAdaptor extends Mp3Player{
    private Mp4Video video;

    @Override
    public void playSong(){
        video.playVideo();
    }
}
