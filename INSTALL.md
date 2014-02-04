Cheat Sheet
===========

1. Maven
```bash
  mvn archetype:generate -DgroupId=edu.umuc.cmis141.helloworlddemo -DartifactId=HelloWorldDemo -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -Dversion=1.0-DEV
```
```bash
  mvn compile
```
```bash
  mvn test
```
```bash
  mvn package
```
```bash
  mvn clean 
```

Pre-Requisite Software
======================

1. IDE
  Sublime Text (Tabs = 4 spaces)

2. Build Tools
  Java 7
  Maven
  Git
  GitHub
  Travis-CI

3. 

Pre-Requisite Reading
======================

1. Coding Conventions
  http://www.oracle.com/technetwork/java/javase/documentation/codeconvtoc-136057.html
  http://www.oracle.com/technetwork/java/codeconv-138413.html
  http://geosoft.no/development/javastyle.html
  http://yohanan.org/steve/projects/java-code-conventions/

2. Documentation Style
  Java Doc
    Documentation - http://www.oracle.com/technetwork/java/javase/documentation/index-137868.html
    Reference - http://www.oracle.com/technetwork/java/javase/documentation/index-jsp-135444.html
    Semantics - http://www.oracle.com/technetwork/java/javase/documentation/index-142372.html

3. Testing
  JUnit
    Wiki - https://github.com/junit-team/junit/wiki
    Reference - https://github.com/junit-team/junit/wiki/Assertions

3. Build Tools
  JAVAC - cd src && javac [PACKAGE]/MainClass.java
  JAVA - cd SRC && java [PACKAGE].MainClass
  Maven
    Getting started in 5 minutes - http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
    Getting started in 30 minutes - 
  Travis CI
    Getting Started - http://docs.travis-ci.com/user/getting-started/
    

2. Project Hierarchy
  Directory Configurations

<pre>
CMIS140
  Assignment1 (project dir)
    src
      main
        java
          edu (package starts here)
            umuc
              assignment1
                file.java
      test
        java
          edu (package starts here)
            umuc
              assignment1
                fileTest.java
    res
    build
    docs
  Assignment2
  Assignment3
</pre>