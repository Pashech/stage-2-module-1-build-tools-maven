package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        char[] ch;
        ch = str.toCharArray();
        String s = org.apache.commons.lang3.StringUtils.valueOf(ch);
        int number = Integer.parseInt(s);
        return number > 0;
    }
}
