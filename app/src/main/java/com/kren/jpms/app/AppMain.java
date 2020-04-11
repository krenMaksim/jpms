package com.kren.jpms.app;

import com.google.common.base.Joiner;

class AppMain {

    public static void main(String[] args) {
        Joiner joiner = Joiner.on("; ")
                              .skipNulls();

        System.out.println("Hello world! " + joiner.join("Harry", null, "Ron", "Hermione"));
    }
}
