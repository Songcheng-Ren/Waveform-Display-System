package utils;

import java.util.ArrayList;
import java.util.List;

public class DataProcess {
    //归一化操作，根据最大值和最小值归一化到绘图区域的y轴范围内
    public static int normalizeValueForYAxis(int height, int value, int maxValue, int minValue){
        return (int) ((double) height / (maxValue - minValue) * (value - minValue));
    }

    //求差分，后一个值减去前一个值
    public static List<Integer> differentialValue(List<Integer> values){
        List<Integer> differentialValues = new ArrayList<>();
        if (values.size() == 0){
            return values;
        }
        for (int i = 1; i < values.size(); i++){
            differentialValues.add(values.get(i) - values.get(i - 1));
        }
        return differentialValues;
    }

}
