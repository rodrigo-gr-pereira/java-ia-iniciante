package exercicios.javaBasico.interFace;

public class Main {
    public static void main(String[] args) {
       /* Ex1:
       var musicPlayer = new MusicPlayer() {
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


        };

        var musicPlayer2 = new MusicPlayer() {
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
        };

        musicPlayer.playMusic();
        System.out.println("1".getClass());
        System.out.println(musicPlayer.getClass());
        System.out.println(musicPlayer2.getClass());
        */

        MusicPlayer musicPlayer = new Computer();
        runMusic(new Computer());
        runVideo(new Computer());

    }

    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }
}
