### Compiling via classpath
`$ javac -cp lib/commons-collections4-4.1.jar  -d out $(find . -name '*.java') `

### Run via classpath
`$ java -cp out:lib/commons-collections4-4.1.jar com.packt.sortstrings.app.App `