### Exprot
`$ 	export CHAPTER_11_ROOT=/c/Users/Maksim_Kren/Documents/EclipseWorkspace/jpms_Eclipse/jpms/koushik-kothagal/chapter-11/02-migrating-to-one-module `

### Compiling modules
`$ javac --module-source-path src --module-path lib -d out $(find . -name '*.java') `

### Run app
`$ java --module-path $CHAPTER_11_ROOT/out:$CHAPTER_11_ROOT/lib -m packt.shoppingbag/com.packt.shoppingbag.app.App `
