# Developer Setup Guide

## In this guide:
+ You will set up Java 1.8, Java Play Framework 1.4, MySQL Server and setup this app

## How to Setup Java Play 1.4 to Work with This Repo
+	Java: version required 1.8
+	Play Framework: 1.4x
+	MySQL Server version: 8.0.12
+ Setup java-play-products app

*The following guide is a walk through on a Windows 8 machine
You will perform the following steps:
1) Install the proper version of Java
+	Download required version from the internet
+	Install locally
+ Set Java path variables
+	Download MySQL Connector
+	Move MySQL JAR file to the JAVA_HOME directory]

2) Install MySQL server
+	Download setup installer from the internet
+	Install locally
+ Enable legacy authentication
+	Set root username and password
+	Install MySQL Workbench

3) Install Play Framework
+	Git clone from Github

4) Setup java-play-products app
+	Git clone from repo into Play folder
+	Apply database evolutions6utr
+	Run server localhost:9000

## 1. Install the Proper Version of Java
1) Install the proper version of Java - 
+ Navigate to Java SE development downloads page:
+ https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
+ Download Windows x86 or x64  package depending on your OS
![Alt text](https://github.com/humanalgorithm/java-play-products/blob/master/developer_setup_guide/java_se_downloads.png "Java SE Downloads Page")
+ Run through the setup and take note of your installation location
![Alt text](https://github.com/humanalgorithm/java-play-products/blob/master/developer_setup_guide/java_se_install.png "Java SE Downloads Page")
+ Right click on "My Computer" to get to properties, click on "Advanced System Settings" and then on "Environment Variables"
+ In this section you will be setting the path of the JDK you just installed. Set a "JAVA_HOME" variable to map to the location of your Java development install location. It should be something like Program Files/Java/jdk_<version info>. Note that we are purposely setting the Java home to point to the JDK and not the JRE (Java Runtime) folder. 
![Alt text](https://github.com/humanalgorithm/java-play-products/blob/master/developer_setup_guide/java_home_variable.png "Java Home Variable")
+ Next you want to make sure that that your JAVA_HOME variable is part of your PATH variable. Your PATH variable tells your command prompt where to look for installed programs. You can either put the full location or use the %<variable_name>% syntax to append to the end of path. 
![Alt text](https://github.com/humanalgorithm/java-play-products/blob/master/developer_setup_guide/path_variable.png "Path Variable")
