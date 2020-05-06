### Exprot JavaFX
````
$ 	export PATH_TO_FX=/c/Users/Maksim_Kren/Downloads/javafx-sdk-11.0.2/lib \
	export PATH_TO_FX_JMODS=/c/Users/Maksim_Kren/Downloads/javafx-jmods-11.0.2 \
	export JAVA_HOME_BASH="/c/Program Files/Java/jdk-11.0.6"
	
````

### Compiling module
`$ javac --module-source-path src --module-path $PATH_TO_FX -d out $(find . -name '*.java') `

### Creating image
`$ jlink --module-path ./out:"$JAVA_HOME_BASH"/jmods --add-modules packt.addressbook --output image `
`$ image/bin/java -m packt.addressbook/packt.addressbook.Main`

`$ jlink --module-path ./out:"$JAVA_HOME_BASH"/jmods:$PATH_TO_FX_JMODS --add-modules packt.addressbook.ui --output image `
`$ image/bin/java -m packt.addressbook.ui/packt.addressbook.ui.Main`

SHOW LIST OF MODULES
`$ image/bin/java --list-modules`

### Building a modular JAR file
contact.jar
`$ jar --create --file out/contact.jar --module-version=1.0 -C out/packt.contact . `

addressbook-ui.jar
`$ jar --create --file out/addressbook-ui.jar --module-version=1.0 --main-class=packt.addressbook.ui.Main -C out/packt.addressbook.ui . ` 

create all nessessary jars
````
$   jar --create --file out/packt-addressbook.jar --module-version=1.0 --main-class=packt.addressbook.Main -C out/packt.addressbook . && \
	jar --create --file out/packt-addressbook-ui.jar --module-version=1.0 --main-class=packt.addressbook.ui.Main -C out/packt.addressbook.ui . && \
	jar --create --file out/packt-addressbook-lib.jar --module-version=1.0 -C out/packt.addressbook.lib . && \	
	jar --create --file out/packt-contact.jar --module-version=1.0 -C out/packt.contact . && \
	jar --create --file out/packt-sortutil.jar --module-version=1.0 -C out/packt.sortutil .	
````

### Executing module
CLI
`$ java --module-path ./out -m packt.addressbook/packt.addressbook.Main `
UI
`$ java --module-path ./out:$PATH_TO_FX -m packt.addressbook.ui/packt.addressbook.ui.Main `
