### Exprot
`$ 	export CHAPTER_11_ROOT=/c/Users/Maksim_Kren/Documents/EclipseWorkspace/jpms_Eclipse/jpms/koushik-kothagal/chapter-11/01-legacy-app  `

### Compiling via classpath
`$ javac -cp lib/commons-collections4-4.1.jar  -d out $(find . -name '*.java') `

### Run via classpath
`$ java -cp $CHAPTER_11_ROOT/out:$CHAPTER_11_ROOT/lib/commons-collections4-4.1.jar com.packt.shoppingbag.app.App `
