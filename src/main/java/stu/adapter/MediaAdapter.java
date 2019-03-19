package stu.adapter;

public class MediaAdapter extends AudioPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String mediaType, String fileName) {
        // TODO Auto-generated method stub

        if (mediaType.equals("mp3")) {
            super.play(mediaType, fileName);
        } else if (mediaType.equals("mp4")) {
            advancedMediaPlayer.MP4Play(fileName);
        } else if (mediaType.equals("avi")) {
            advancedMediaPlayer.AVIPlay(fileName);
        }

    }

}
