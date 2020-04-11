module jpms.service {
    requires spring.context;
    requires spring.beans;

    requires com.google.common;

    exports com.kren.jpms.service;
    exports com.kren.jpms.service.spring;
}
