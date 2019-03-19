package stu.adapter;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.play("mp3", "mp3file.mp3");
        mediaPlayer.play("mp4", "mp4file.mp4");
        
        AdvancedMediaPlayer advancedMediaPlayer = new WindowsPlayer();
        MediaPlayer mediaPlayer2 = new MediaAdapter(advancedMediaPlayer);
        mediaPlayer2.play("mp3", "mp3file.mp3");
        mediaPlayer2.play("mp4", "mp4file.mp4");

    }

}
