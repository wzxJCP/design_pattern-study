package com.xing.pattern_23.structural_7.adapter_2;

/**
 * @project：design_pattern-study
 * @since：2024/11/13 11:12
 * @author：wzx
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放 vlc 文件: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // 当前格式为vlc格式,mp4不做具体实现
        System.out.println("不支持 mp4 文件播放");
    }
}
