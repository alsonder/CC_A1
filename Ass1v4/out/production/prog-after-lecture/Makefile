antlrjar = antlr-4.13.2-complete.jar

###### FOR LINUX AND MAC -- uncomment the following line if you do not use Windows:
# classpath = '$(antlrjar):.'

###### FOR WINDOWS -- comment the following line if you do not use Windows:
classpath = '$(antlrjar);.'

antlr4 = java -cp $(classpath) org.antlr.v4.Tool
grun = java -cp $(classpath) org.antlr.v4.gui.TestRig
SRCFILES = main.java
GENERATED = ccListener.java ccBaseListener.java ccParser.java ccLexer.java ccBaseVisitor.java ccVisitor.java 

all:	
	make grun

ccLexer.java:	cc.g4
	$(antlr4) -visitor cc.g4

ccLexer.class:	ccLexer.java
	javac -cp $(classpath) $(GENERATED)

grun:	ccLexer.class prog.txt
	$(grun) cc start -gui -tokens prog.txt 

clean:	
	rm -f *.class *.interp *.tokens
