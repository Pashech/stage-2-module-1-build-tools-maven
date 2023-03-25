package com.epam.utils;

import javax.swing.undo.AbstractUndoableEdit;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if(str == null){
            return false;
        }else if(str.equals("")){
            return false;
        } else if (str.equals(" ")) {
            return false;
        }
        char[] ch;
        ch = str.toCharArray();
        String s = org.apache.commons.lang3.StringUtils.valueOf(ch);
        double number = Double.parseDouble(s);
        System.out.println(number);
        return number > 0;
    }

    public static void main(String[] args) {
        System.out.println(StringUtils.isPositiveNumber("-11.22"));
    }
}
