module com.kren.standalone.app {
    requires spring.context;
    requires spring.beans;
    requires spring.core;

    opens com.kren.standalone.app.spring to spring.core, spring.beans, spring.context;
    opens com.kren.standalone.app.service to spring.core, spring.beans, spring.context;
}
