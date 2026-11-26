/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication28;

/**
 *
 * @author yossi
 */

public class ArrayStatistics {

    private float maxValue;
    private float minValue;

    public float getMaxValue() {
        return maxValue;
    }

    public float getMinValue() {
        return minValue;
    }

    public void findMaxMin(float[] values) {

        maxValue = values[0];
        minValue = values[0];

        for (int i = 1; i < values.length; i++) {

            if (values[i] > maxValue) {
                maxValue = values[i];
            }

            if (values[i] < minValue) {
                minValue = values[i];
            }
        }
    }
}


