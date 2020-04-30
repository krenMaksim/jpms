`$ find "$(pwd)"`
### Compiling module
`
$ javac --module-source-path src -d out \
	src/packt.addressbook/module-info.java \
	src/packt.addressbook/packt/addressbook/Main.java
`

### Executing module
` $ java --module-path out --module packt.addressbook/packt.addressbook.Main `
OR
` $ java -p out -m packt.addressbook/packt.addressbook.Main `



