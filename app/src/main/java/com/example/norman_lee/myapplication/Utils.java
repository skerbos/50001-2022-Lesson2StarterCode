package com.example.norman_lee.myapplication;

public class Utils {

    static void checkValidInputs(String value)
    {
        if (Integer.parseInt(value) <= 0)
        {
            throw new IllegalArgumentException("cannot input negative number");
        }
        if (value.equals(""))
        {
            throw new NumberFormatException("cannot have empty value");
        }
    }

}
