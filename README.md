# RetroChallenge
Challenge for RetroRabbit

Prerequisites:  Java 1.8, Maven
<hr>
Compiling and running from commandline:

Download and unzip files. Navigate to project directory.

Compile instructions:
From project root directory, run the following command:
<b>mvn clean package</b>

Running instructions:
From project root directory, run the following command:
<b>java -jar target\RetroChallenge-1.0.jar {SEARCH STRING} {TEST FILE}</b>

Example:
java -jar target\RetroChallenge-1.0.jar ABCDEF testFile.txt

<hr>
Alternatively:
Import into IDE of choice as Maven project. 

Set commandline parameters in run configuration as {SEARCH STRING} {TEST FILE}.  

Set Maven build goals to {clean package}.

Execute Maven goals and Run.
