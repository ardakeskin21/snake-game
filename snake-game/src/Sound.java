import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {

    Clip clip;
    URL soundURL[] = new URL[10];

    public Sound() {

        soundURL[0] = getClass().getResource("/sound/coin.wav");
        soundURL[1] = getClass().getResource("/sound/GameOverSound.wav");

    }

    public void setFile(int i) {

        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);

        }catch (Exception e ) {

        }
    }

    public void play() {

        clip.start();

    }
}