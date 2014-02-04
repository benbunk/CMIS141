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
  mvn javadoc:javadoc
```
```bash
  mvn package
```
```bash
  mvn clean 
```

2. Java
```bash
  java -cp "target/HelloWorldDemo-1.0-DEV.jar" edu.umuc.cmis141.helloworlddemo.App
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
  Assignment2
  Assignment3
  docs
  INSTALL.md
  README.md
  NOTES.md
</pre>

Maven Example pom.xml
=====================

This example POM includes javadoc and base encoding that isn't included in the archetype getting started.

```XML
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>edu.umuc.cmis141.helloworlddemo</groupId>
  <artifactId>HelloWorldDemo</artifactId>
  <packaging>jar</packaging>
  <version>1.0-DEV</version>
  <name>HelloWorldDemo</name>
  <url>http://maven.apache.org</url>
  <properties>
      <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
      <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
  </properties>
  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
  <build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-javadoc-plugin</artifactId>
      <version>2.9.1</version>
      <executions>
        <execution>
          <id>attach-javadocs</id>
          <goals>
            <goal>jar</goal>
          </goals>
        </execution>
      </executions>
    </plugin>
  </plugins>
</build>
</project>
```