package exercicios.javaBasico.interFace;

public interface MusicPlayer {

    /*public final static -> não necesario em interfaces, pois já são publicas, finais e estaticas.

    String music = "Parabéns pra voce";
     */

    void playMusic();

    void pauseMusic();

    void  stopMusic();
}
