### Exprot JavaFX
`$ export PATH_TO_FX=/c/Users/Maksim_Kren/Downloads/javafx-sdk-11.0.2/lib`

### Compiling module
`$ javac --module-source-path src --module-path $PATH_TO_FX -d out $(find . -name '*.java') `

### Executing module
` java --module-path ./out:$PATH_TO_FX -m packt.addressbook.ui/packt.addressbook.ui.Main `