IDE-Friendly Spring loaded  based RAD support for Alfresco

Run this project with:

0. Clone this repo
1. Download spring loaded from http://search.maven.org/remotecontent?filepath=org/springframework/springloaded/1.2.0.RELEASE/springloaded-1.2.0.RELEASE.jar
2. MAVEN_OPTS="-Xms1024m -Xmx2048m -XX:PermSize=1024m -javaagent:/path/to/your/springloaded/jar/springloaded-1.2.0.RELEASE.jar -noverify" mvn clean install -Pspring-loaded
3. Import in Eclipse Luna for JEE Devs
4. Change Java code (or create new classes), webscripts (FTL, Java, Javascript - requires Webscript reload), static resources, jsp, etc
5. Reload your browser!
6. Profit :)

No webapp reload!

Limitations:

Currently doesn't reload:

- Spring configuration files / beans hierarchies (requires restart)
- Webscript Javascripts (requires caching disabling, manual call to webscript reload)


