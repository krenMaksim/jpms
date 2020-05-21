### Executing module
` java --module-path ./lib:. -m jpms.app/com.kren.jpms.app.AppMain `

### Creating image issue 
http://www.00w5.com/questions/56656822/Java-11-JLink-getting-error-automatic-module-cannot-be-used-with-jlink-commicrosoftsqlserverjdbc-from-file.html
`$ jlink --module-path ./lib:. --add-modules jpms.app --output image `

### @ComponentScan issue
http://www.00w5.com/questions/57204211/@ComponentScan-does-not-detect-classes-in-module-path.html