package com.example.hrishav.converterapp;

/**
 * Created by HP on 7/2/2017.
 */

public class UnitConverter {
    public static double celsiusToForenhiet (double f)
    {
        return (f-32)*5/9;
    }

    public static double forenhietToCelsius (double c)
    {
        return 32+c*9/5;
    }
}
