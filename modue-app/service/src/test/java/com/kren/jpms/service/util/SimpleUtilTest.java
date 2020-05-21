package com.kren.jpms.service.util;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class SimpleUtilTest {

    @Test
    public void doSomething() {
        assertFalse(SimpleUtil.doSomething().isBlank());
    }
}
