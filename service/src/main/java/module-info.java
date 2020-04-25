module jpms.service {
    exports com.kren.jpms.service;
    exports com.kren.jpms.service.spring;

    opens com.kren.jpms.service.spring;
    opens com.kren.jpms.service.impl;

    requires com.google.common;
    requires transitive spring.context;
    requires transitive spring.beans;
}
