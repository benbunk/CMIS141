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
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>edu.umuc.cmis141.helloworlddemo</groupId>
  <artifactId>HelloWorldDemo</artifactId>
  <packaging>jar</packaging>
  <version>1.0-DEV</version>
  
  <name>HelloWorld Discussion Assignment.</name>
  <description>The HelloWorldDemo program is built to display a message to the end user.</description>
  <url>https://github.com/benbunk/CMIS141/tree/master/HelloWorldDemo</url>

  <issueManagement>
    <url>https://github.com/benbunk/CMIS141/issues</url>
    <system>GitHub Issues</system>
  </issueManagement>

  <licenses>
    <license>
      <name>MIT License</name>
      <url>http://www.opensource.org/licenses/mit-license.php</url>
      <distribution>repo</distribution>
    </license>
  </licenses>

  <scm>
    <url>https://github.com/benbunk/CMIS141</url>
    <connection>scm:git:git://github.com/benbunk/CMIS141.git</connection>
    <developerConnection>scm:git:git@github.com:benbunk/CMIS141.git</developerConnection>
  </scm>

  <developers>
    <developer>
      <email>benbunk+classupdate@gmail.com</email>
      <name>Benjamin Bunk</name>
      <url>https://github.com/benbunk</url>
      <id>benbunk</id>
    </developer>
  </developers>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
  </properties>

  <build>
    <pluginManagement>
      <plugins>
        <plugin>
          <groupId>org.codehaus.mojo</groupId>
          <artifactId>findbugs-maven-plugin</artifactId>
          <version>2.5.4-SNAPSHOT</version>
        </plugin>
      </plugins>
    </pluginManagement>
    <plugins>
      <plugin>
        <groupId>com.github.github</groupId>
        <artifactId>site-maven-plugin</artifactId>
        <version>0.9</version>
        <configuration>
          <message>Building site for ${project.version}</message>
          <server>github</server>
          <path>${project.artifactId}</path>
        </configuration>
        <executions>
          <execution>
            <goals>
              <goal>site</goal>
            </goals>
            <phase>site</phase>
          </execution>
        </executions>
      </plugin>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-site-plugin</artifactId>
        <version>3.3</version>
        <configuration>
          <reportPlugins>
            <plugin>
              <groupId>org.apache.maven.plugins</groupId>
              <artifactId>maven-project-info-reports-plugin</artifactId>
              <version>2.2</version>
              <configuration>
                <dependencyDetailsEnabled>true</dependencyDetailsEnabled>
                <dependencyLocationsEnabled>true</dependencyLocationsEnabled>
              </configuration>
            </plugin>
            <plugin>
              <groupId>org.apache.maven.plugins</groupId>
              <artifactId>maven-javadoc-plugin</artifactId>
              <version>2.9.1</version>
            </plugin>
            <plugin>
              <groupId>org.apache.maven.plugins</groupId>
              <artifactId>maven-surefire-report-plugin</artifactId>
              <version>2.6</version>
            </plugin>
            <plugin>
              <groupId>org.apache.maven.plugins</groupId>
              <artifactId>maven-checkstyle-plugin</artifactId>
              <version>2.6</version>
            </plugin>
            <plugin>
              <groupId>org.codehaus.mojo</groupId>
              <artifactId>findbugs-maven-plugin</artifactId>
              <version>2.5.3</version>
              <configuration>
              </configuration>
            </plugin>
          </reportPlugins>
        </configuration>
      </plugin>
    </plugins>
  </build>

  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
</project>
```