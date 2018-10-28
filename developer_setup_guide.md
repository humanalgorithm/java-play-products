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

2) Install MySQL server
+	Download setup installer from the internet
+	Install locally
+ Enable legacy authentication
+	Set root username and password
+	Install MySQL Workbench

3) Install MySQL Connector
+ Locate MySQL connector Jar that was created in the MySQL that was createdd in the MySQL installation
+ Move MySQL connector Jar to the appropriate location

4) Install Play Framework
+	Git clone from Github

5) Setup java-play-products app
+	Git clone from repo into Play folder
+	Apply database evolutions
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

## 2) Install MySQL server
+	Download setup installer from the internet -> URL to download the MySQL installer is https://dev.mysql.com/downloads/mysql/
+ Download the smaller version, which is the guided installer

![Alt text](https://github.com/humanalgorithm/java-play-products/blob/master/developer_setup_guide/mysql_download.png "MySQL Download")

+ After you finish the download, run the "MySQL Installer" which is the guided installation process
+ In the MySQL installer we want to install 3 features "MySQL Server", "MySQL Workbench" and "Connector/J".
+ MySQL Server is the actual database server
+ MySQL Workbench is a UI interface that allows us to interact with the database server
+ Connector/J is the the JDBC driver that we will be using to connect to the MySQL server from our application
+ You get to this screen by cilcking on "Add.." which will bring you to the "Select Products and Features" screen

![Alt text](https://github.com/humanalgorithm/java-play-products/blob/master/developer_setup_guide/mysql_installer_features.png "MySQL Installer")

+ Go through the installation until you get to the screen regarding authentication, in this case we want to select legacy authentication like so:

![Alt text](https://github.com/humanalgorithm/java-play-products/blob/master/developer_setup_guide/legacy_authentication.png "Legac Authentication")

+ **Set user and password&**
+ When you get to the part of the installation that asks for a root user password set the password to "root". Note that you do not **have** to set it this way but if you use a different password you will need to update this in the application.conf of the java-play-products program

## 3) Install MySQL connector
+ After the MySQL installation the Connector/J step will leave a jar file in your MySQL installation path
+ For example the connector J jar file will get dropped in C:\Program Files (x86)\MySQL\Connector J 8.0

![Alt text](https://github.com/humanalgorithm/java-play-products/blob/master/developer_setup_guide/connector_j_jar.png "Connector J")

+ We want to copy this jar into our Java runtime environment which we set in the previous step. 
+ The file name of the jar will be called mysql-connector
+ You need to copy the file into the the JAVA_HOME/jre/lib/ext/ path. In this case that is located in C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext

![Alt text](https://github.com/humanalgorithm/java-play-products/blob/master/developer_setup_guide/connector_j_move.png "Connector J Move")

+ Notice that we are going into the jre subfolder of the java development kit path* 

## 4) Install Play Framework
+	Git clone from Github
+ Git clone Java Play 1.4 from the following URL: https://github.com/playframework/play1.git
+ From your command prompt run "git clone https://github.com/playframework/play1.git" in this case I am running from c:/Users/Michael/Desktop/play_repo and the cloned folder will live at C:/Users/Michael/Desktop/play_repo/play1

![Alt text](https://github.com/humanalgorithm/java-play-products/blob/master/developer_setup_guide/git_clone_playframework.png "Git PLay Framework")

+ From the directory you cloned the Play Framework into you will now be able to run the "play" command

+ Note that Play Framework pulls down a copy of Python in order to run, this is **not** the version of Python you may already have installed on your machine. If you get an error when running the play like the following you can fix it by copying existing python files on your machine to the python directory provided in the play framework. In my case I am copying all of the python files in the folder C:\Python27 to C:\Users\Michael\Desktop\play1\python

![Alt text](https://github.com/humanalgorithm/java-play-products/blob/master/developer_setup_guide/python_to_python.png "Copy Python to Python")

## 5) Setup java-play-products app
+	Git clone from repo into Play folder. From the /play folder you cloned the Play Framework into, do a git clone of this repo like so:
+ git clone https://github.com/humanalgorithm/java-play-products.git

![Alt text](https://github.com/humanalgorithm/java-play-products/blob/master/developer_setup_guide/git_clone_humanalgorithm.png "Git Clone Humanalgorithm")

+ Now you can run the play evolutions which will create the necessary database tables, use the following command:
+ play evolutions:apply java-play-products where "java-play-products" is the name of the app
+ You will see the following output when you run this command: 

![Alt text](https://github.com/humanalgorithm/java-play-products/blob/master/developer_setup_guide/play_evolutions_apply.png "Play evolutions apply")


+	Apply database evolutions
+	Run server localhost:9000
