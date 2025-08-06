package exercicios.javaBasico.interFace;

public class Computer implements VideoPlayer, MusicPlayer {

    @Override
    public void playVideo() {
        System.out.println("Playing video on computer.");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Video paused on computer.");
    }

    @Override
    public void stopVideo() {
        System.out.println("Video stopped on computer.");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music on computer.");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Music paused on computer.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stopped on computer.");
    }
}
