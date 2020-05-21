module com.kren.standalone.surefire.plugin.app {
    requires spring.context;
    requires spring.beans;
    requires spring.core;

    opens com.kren.standalone.surefire.plugin.app.spring to spring.core, spring.beans, spring.context;
    opens com.kren.standalone.surefire.plugin.app.service to spring.core, spring.beans, spring.context;
}
