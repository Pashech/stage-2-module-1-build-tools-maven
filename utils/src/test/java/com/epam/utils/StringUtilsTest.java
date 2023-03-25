package com.epam.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        Assertions.assertTrue(StringUtils.isPositiveNumber("1"));
        Assertions.assertFalse(StringUtils.isPositiveNumber("-1"));
    }
}