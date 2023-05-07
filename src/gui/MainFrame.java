package gui;


import listener.MainFrameActionListener;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public static StatisticsPanel statisticsPanel = null;
    public static WavePanelContainer wavePanelContainer = null;

    public MainFrame(){
        initMenu();
        //窗口的设置
        this.setSize(900,600);
        this.setResizable(false); //不可调整大小
        this.setTitle("chart-信号数据处理系统 v1.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //退出
        ImageIcon icon = new ImageIcon("icon.png");
        this.setIconImage(icon.getImage());

        /*左边的数据显示面板*/
        statisticsPanel = new StatisticsPanel();
        add(statisticsPanel, BorderLayout.WEST);


        /*右边的通道采集面板*/
        wavePanelContainer = new WavePanelContainer(statisticsPanel.getStatisticsDashboard().getStatisticsWraps());
        add(wavePanelContainer, BorderLayout.EAST);


        this.pack(); //调整此窗口的大小，以适合其子组件的首选大小和布局
        this.setVisible(true);
    }

    /**
     * description:菜单栏的初始化
     */
    private void initMenu(){
        JMenuBar menuBar = new JMenuBar(); //实例化菜单栏
        JMenu open = new JMenu("打开");
        JMenu statistics = new JMenu("数据处理");

        JMenuItem differential = new JMenuItem("微分运算");

        JMenuItem fromFile = new JMenuItem("从文件打开");
        JMenuItem fromVirtualMachine = new JMenuItem("模拟实时采集");
        MainFrameActionListener listener = new MainFrameActionListener();

        differential.addActionListener(listener);
        statistics.add(differential);
        fromFile.addActionListener(listener);
        fromVirtualMachine.addActionListener(listener);
        open.add(fromFile);
        open.add(fromVirtualMachine);
        menuBar.add(open);
        menuBar.add(statistics);
        this.setJMenuBar(menuBar);
    }
}
