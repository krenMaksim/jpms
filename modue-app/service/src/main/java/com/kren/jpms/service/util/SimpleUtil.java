package com.kren.jpms.service.util;

import com.google.common.base.Joiner;

public class SimpleUtil {

    public static String doSomething() {
        Joiner joiner = Joiner.on("; ")
                              .skipNulls();

        return joiner.join("Harry", null, "Ron", "Hermione");
    }

}
