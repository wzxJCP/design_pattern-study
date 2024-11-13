package com.xing.pattern_23.structural_7.adapter_2;

/**
 * @project：design_pattern-study
 * @since：2024/11/13 11:36
 * @author：wzx
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // 当前格式为mp4格式,vlc不做具体实现
        System.out.println("不支持 vlc 文件播放");
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放 mp4 文件: " + fileName);
    }
}
