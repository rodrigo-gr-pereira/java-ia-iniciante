package exercicios.javaBasico.interFace;

public class MusicBox implements MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("Playing music from MusicBox.");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Music paused in MusicBox.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stopped in MusicBox.");
    }
}
