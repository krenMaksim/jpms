module jpms.service {
    requires spring.context;
    requires spring.beans;
    requires com.google.common;
    
    opens com.kren.jpms.service.spring to spring.core;
    opens com.kren.jpms.service.impl to spring.beans;

    exports com.kren.jpms.service;
    exports com.kren.jpms.service.spring;
}
