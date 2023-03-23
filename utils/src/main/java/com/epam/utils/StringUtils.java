package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        int number = Integer.parseInt(org.apache.commons.lang3.StringUtils.getDigits(str));
        return number > 0;
    }
}
