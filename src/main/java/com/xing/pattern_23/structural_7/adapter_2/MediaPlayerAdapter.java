package com.xing.pattern_23.structural_7.adapter_2;

/**
 * @project：design_pattern-study
 * @since：2024/11/13 11:37
 * @author：wzx
 */
public class MediaPlayerAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(String audioType){
        //根据传入的参数来创建对象
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        //判断当前的格式audioType为vlc还是mp4
        if(audioType.equalsIgnoreCase("vlc")){
            //创建vlc高级媒体播放器进行播放文件
            advancedMediaPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            //创建mp4高级媒体播放器进行播放文件
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
