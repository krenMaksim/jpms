module com.kren.encapsulated.service {
    requires spring.context;
    requires spring.beans;
    requires spring.core;

    opens com.kren.encapsulated.service.spring to spring.core, spring.beans, spring.context;
    opens com.kren.encapsulated.service.impl to spring.core, spring.beans, spring.context;
}
