chcp 65001 
javac -d bin -sourcepath src -cp resources\lib\spring-context-5.1.4.RELEASE.jar;resources\lib\spring-core-5.1.4.RELEASE.jar;resources\lib\spring-beans-5.1.4.RELEASE.jar src\com\springinaction\springidol\MainClass.java src\com\springinaction\springidol\*.java 


java -classpath bin;resources\lib\commons-logging-1.2.jar;resources\lib\spring-context-5.1.4.RELEASE.jar;resources\lib\spring-core-5.1.4.RELEASE.jar;resources\lib\spring-beans-5.1.4.RELEASE.jar;resources\lib\spring-expression-5.1.4.RELEASE.jar com.springinaction.springidol.MainClass