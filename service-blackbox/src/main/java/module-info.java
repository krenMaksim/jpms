open module jpms.blackbox {
    requires jpms.service;

    requires spring.core;
    requires spring.test;

    requires org.junit.jupiter.api;
    requires org.junit.platform.commons;
    requires org.junit.platform.engine;
    requires org.junit.jupiter.params;
    requires org.junit.jupiter.engine;
}
