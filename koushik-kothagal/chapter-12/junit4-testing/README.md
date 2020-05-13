### Exprot
`$ 	export CHAPTER_12_JUNIT=/c/Users/Maksim_Kren/Documents/EclipseWorkspace/jpms_Eclipse/jpms/koushik-kothagal/chapter-12/junit4-testing `

### Compiling modules
`$ javac --module-source-path src --module-path lib -d out $(find . -name '*.java') `

### Run handmade test (the -ea argument) tells us that our tests have passed
`$ java --module-path $CHAPTER_12_JUNIT/out:$CHAPTER_12_JUNIT/lib -m packt.sortutil.test/packt.util.test.SortUtilTestMain `

### Run junit4 test
Failure 
`$ java --module-path $CHAPTER_12_JUNIT/out:$CHAPTER_12_JUNIT/lib --module junit/org.junit.runner.JUnitCore packt.util.test.SortUtilTest `

Success  
`$ java --module-path $CHAPTER_12_JUNIT/out:$CHAPTER_12_JUNIT/lib --add-modules packt.sortutil.test --module junit/org.junit.runner.JUnitCore packt.util.test.SortUtilTest `