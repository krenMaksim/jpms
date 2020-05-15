### Exprot
`$ 	export CHAPTER_12_JUNIT=/c/Users/Maksim_Kren/Documents/EclipseWorkspace/jpms_Eclipse/jpms/koushik-kothagal/chapter-12/junit5-testing `

### Compiling modules
`$ javac --module-source-path src --module-path lib -d out $(find . -name '*.java') `

### Run junit5 test
`$ java --module-path $CHAPTER_12_JUNIT/out:$CHAPTER_12_JUNIT/lib --add-modules packt.sortutil.test --module org.junit.jupiter.engine/org.junit.platform.console.ConsoleLauncher packt.util.test.SortUtilTest `

### Take a look at jar dependency
`$ jdeps -cp lib/junit-jupiter-5.6.2.jar -recursive -summary out`
`$ jdeps -cp lib/junit-platform-console-standalone-1.6.2.jar --multi-release 9 -recursive -summary out`


`$ java -jar junit-platform-console-standalone-1.6.2.jar --disable-ansi-colors --cp 'out' --select-package packt.util.test `
### Not sure whether I use module-path
`$ java -jar junit-platform-console-standalone-1.6.2.jar --disable-ansi-colors -d out  --scan-modules `
`$ java -jar junit-platform-console-standalone-1.6.2.jar --disable-ansi-colors -d out  --select-module=packt.sortutil.test `

