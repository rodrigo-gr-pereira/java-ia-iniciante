package exercicios.javaBasico.interFace;

public interface VideoPlayer extends MusicPlayer {

    /*public final static -> não necessário em interfaces, pois já são publicas, finais e estaticas.

    String video = "Video.mp4";
    */

    void playVideo();

    void pauseVideo();

    void stopVideo();
}
