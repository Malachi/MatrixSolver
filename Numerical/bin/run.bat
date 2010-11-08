@echo on
CLS
rem Press any key to run the program
PAUSE
rem Running The Program...
java -Xms384m -Xmx786m -XX:PermSize=64M -XX:MaxPermSize=128M -classpath . Main
PAUSE