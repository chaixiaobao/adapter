package stu.adapter;

public class AudioPlayer implements MediaPlayer {

    public void play(String mediaType, String fileName) {
        // TODO Auto-generated method stub
        if (mediaType.equals("mp3")) {
            System.out.println("播放MP3文件：" + fileName);
        } else {
            System.out.println("不支持播放" + mediaType + "文件！");
        }
    }
}
