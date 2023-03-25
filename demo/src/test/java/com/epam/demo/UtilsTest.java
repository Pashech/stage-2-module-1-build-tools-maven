package com.epam.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class UtilsTest {


    @Test
    void isAllPositiveNumbersWithTrue() {
        List<String> trueList = Arrays.asList("1", "2", "4");
        Assertions.assertTrue(Utils.isAllPositiveNumbers(trueList));
    }

    @Test
    void isAllPositiveNumbersWithFalse() {
        List<String> falseList = Arrays.asList("1", "2", "-4");
        Assertions.assertFalse(Utils.isAllPositiveNumbers(falseList));
    }
}