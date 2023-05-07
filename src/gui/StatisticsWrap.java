package gui;

import javax.swing.*;
import java.awt.*;

public class StatisticsWrap extends Panel {
    private JLabel integrate;
    private JLabel mean;
    private int integrateValue = -1;

    private int meanValue = -1;
    StatisticsWrap(){
        this.setPreferredSize(new Dimension(180,25));
        integrate = new JLabel();
        integrate.setPreferredSize(new Dimension(80,25));
        integrate.setText("积分:-1");
        mean = new JLabel();
        mean.setPreferredSize(new Dimension(80,25));
        mean.setText("平均值:-1");
        GridLayout layout = new GridLayout(1,2);
        this.add(integrate, layout);
        this.add(mean, layout);
    }

    public int getIntegrateValue() {
        return integrateValue;
    }

    void setIntegrateValue(int integrateValue) {
        this.integrateValue = integrateValue;
        this.integrate.setText("积分:" + integrateValue);
    }

    public int getMeanValue() {
        return meanValue;
    }

    void setMeanValue(int meanValue) {
        this.meanValue = meanValue;
        this.mean.setText("平均值：" + this.meanValue);
    }
}
