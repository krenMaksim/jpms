### Exprot
`$ 	export CHAPTER_12_JUNIT=/c/Users/Maksim_Kren/Documents/EclipseWorkspace/jpms_Eclipse/jpms/koushik-kothagal/chapter-12/junit5-testing `

### Compiling modules
`$ javac --module-source-path src --module-path lib -d out $(find . -name '*.java') `

### Run junit5 test
`$ java --module-path $CHAPTER_12_JUNIT/out:$CHAPTER_12_JUNIT/lib --add-modules packt.sortutil.test --module org.junit.platform.console --select-module=packt.sortutil.test `
