package com.xing.pattern_23.structural_7.adapter_2;

/**
 * @project：design_pattern-study
 * @since：2024/11/13 10:55
 * @author：wzx
 */
/**
 * MediaPlayer 接口定义了一个播放媒体文件的方法。
 */
public interface MediaPlayer {
    /**
     * 播放指定类型的音频文件。
     * @param audioType 音频文件的类型，例如 "mp3"、"wav" 等。
     * @param fileName 音频文件的名称，包括扩展名。
     */
    public void play(String audioType, String fileName);
}
