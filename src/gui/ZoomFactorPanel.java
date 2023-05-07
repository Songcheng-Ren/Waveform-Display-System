package gui;

import listener.SliderChangeListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

//通道缩放
public class ZoomFactorPanel extends JPanel {
    private JSlider slider = null;
    public ZoomFactorPanel(){
        this.setPreferredSize(new Dimension(190,80));
        this.setBorder(new TitledBorder("通道缩放"));
        slider = new JSlider();
        slider.setName("zoomFactor");
        slider.setMinimum(-7);
        slider.setMaximum(7);
        slider.setPaintTrack(false); //不在滑块上绘制滑道
        slider.setPaintTicks(true); //在滑块上绘制刻度标记
        slider.setPaintLabels(true); //在滑块上绘制标签
        slider.setValue(0);
        slider.setSnapToTicks(true); //解析为最靠近用户放置滑块处的刻度标记的值
        slider.setMajorTickSpacing(2); //设置主刻度标记的间隔
        slider.setPreferredSize(new Dimension(160,50));
        slider.addChangeListener(new SliderChangeListener());
        this.add(slider, BorderLayout.NORTH);
    }
    public void reset(){
        this.slider.setValue(0);
    }

    public JSlider getSlider() {
        return slider;
    }

    public void setSlider(JSlider slider) {
        this.slider = slider;
    }
}
