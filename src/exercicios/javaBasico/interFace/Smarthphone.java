package exercicios.javaBasico.interFace;

public class Smarthphone implements VideoPlayer, MusicPlayer {

    @Override
    public void playVideo() {
        System.out.println("Playing video.");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Video paused.");
    }

    @Override
    public void stopVideo() {
        System.out.println("Video stopped.");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music.");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Music paused.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stopped.");
    }
}
