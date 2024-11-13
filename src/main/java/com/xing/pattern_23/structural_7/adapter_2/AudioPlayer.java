package com.xing.pattern_23.structural_7.adapter_2;

/**
 * @project：design_pattern-study
 * @since：2024/11/13 11:38
 * @author：wzx
 */
public class AudioPlayer implements MediaPlayer {
    private MediaPlayerAdapter madplayerAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("播放 mp3 文件："+fileName);
        }else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            //创建适配器对象
            MediaPlayerAdapter adapter = new MediaPlayerAdapter(audioType);
            //调用适配器的play方法
            adapter.play(audioType,fileName);
        }else{
            System.out.println("暂不支持该格式："+audioType);
        }
    }
}
