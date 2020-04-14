module jpms.app {
    requires jpms.service;

    requires spring.context;
    requires spring.core;
    
    opens com.kren.jpms.app.spring to spring.core, spring.beans, spring.context;
}
