package com.xing.pattern_23.structural_7.adapter_2;

/**
 * @project：design_pattern-study
 * @since：2024/11/13 11:39
 * @author：wzx
 */
public class Test {
    public static void main(String[] args) {
        // 播放 mp3 音乐文件的内置支持
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "中国人.mp3");
        audioPlayer.play("vlc", "中国人.vlc");
        audioPlayer.play("mp4", "中国人.mp4");
        audioPlayer.play("avi", "中国人.avi");
    }
}

/**
 * 播放 mp3 文件：中国人.mp3
 * 播放 vlc 文件: 中国人.vlc
 * 播放 mp4 文件: 中国人.mp4
 * 暂不支持该格式文件：avi
 */
/**
 * MediaPlayer播放器接口
 * AdvancedMediaPlayer 高级播放器接口
 * MediaPlayerAdapter 适配器
 * VlcPlayer vlc播放器
 * Mp4Player mp4播放器
 * MediaPlayerAdapter 媒体播放器适配器
 * AudioPlayer 音频播放器
 * Test 测试类
 *
 * 首先，定义 MediaPlayer 接口和 AdvancedMediaPlayer 接口，以及两个实现了 AdvancedMediaPlayer 接口的具体类 VlcPlayer 和 Mp4Player。
 * 接下来，创建一个适配器类 MediaPlayerAdapter，它实现了 MediaPlayer 接口，并且持有一个 AdvancedMediaPlayer 类型的对象。这个适配器可以根据传入的音频类型选择合适的播放器。
 * 最后，我们创建一个 AudioPlayer 类，它使用 MediaPlayer 接口，但通过适配器可以播放 VLC 和 MP4 格式的文件。
 * 现在，我们可以编写一个测试类来验证适配器模式的工作情况。测试类
 */