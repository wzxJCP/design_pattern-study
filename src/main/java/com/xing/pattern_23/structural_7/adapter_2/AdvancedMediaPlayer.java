package com.xing.pattern_23.structural_7.adapter_2;

/**
 * @project：design_pattern-study
 * @since：2024/11/13 11:11
 * @author：wzx
 */
// 高级播放器
public interface AdvancedMediaPlayer {
    // 播放vlc文件
    public void playVlc(String fileName);
    // 播放mp4文件
    public void playMp4(String fileName);
}
