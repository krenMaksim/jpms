### Background
https://github.com/qutax/jpms-spring-example

### Executing module
````
$ export SPRING_BOOT_MODULE=`pwd`; echo $SPRING_BOOT_MODULE

$ java --module-path "$SPRING_BOOT_MODULE"/target/lib:"$SPRING_BOOT_MODULE"/target/springboot-module-0.0.1-SNAPSHOT.jar \
	--add-modules java.instrument -m com.kren.springbootmodule/com.kren.springbootmodule.SpringbootModuleApplication
````

### Running from Eclipse
Run configurations... --> Arguments --> VM arguments --> --add-modules java.instrument 
