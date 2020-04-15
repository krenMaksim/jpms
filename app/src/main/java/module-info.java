module jpms.app {
    opens com.kren.jpms.app.spring;

    requires jpms.service;
    requires spring.core;
}
