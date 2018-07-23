## Camel Routing in JBoss Fuse
This is an example project for creating Apache Camel Routes on the JBoss Fuse platform 
that are exposed by using CXFRS

### Getting Started
This guide assumes that you have the following installed:
- [Apache Maven](https://maven.apache.org/download.cgi)
- [Java JRE](http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html)
- [Java JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

#### Creating the OSGI bundle
An OSGI bundle can be created by running this maven command at the root of the project:
```bash
mvn clean install
```
The artifact will generated and stored in the `target/` directory
and in your `~/.m2` repository.
#### Installing the OSGI Bundle into JBoss Fuse
Before deploying the bundle, ensure that JBoss Fuse has been configured. 
See [Configuring JBoss Fuse](docs/configuring-jboss-fuse.md)

In the **JBoss Fuse client**, install the bundle using maven:
```bash
osgi:install -s mvn:org.bob.cxfrs/example/0.0.1-SNAPSHOT
```
JBoss Fuse will install the bundle from your local `~/.m2` repository.
The `-s` option will start the bundle once it is installed.

See [Managing OSGI Bundles](docs/managing-osgi-bundles.md) 
for updating the bundle when changes have been made

#### Verify the Application is working
##### CXF Endpoints
You can view the available RESTful services by navigating to here in a web browser: http://localhost:8181/cxf
```
Available RESTful services:
Endpoint address: http://localhost:9000/employeeservice
WADL : http://localhost:9000/employeeservice?_wadl
```
##### Camel Route and Processor
Navigate to here in a web browser: http://localhost:9000/employeeservice/employees/bob

The [Processor](src/main/java/org/bob/cxfrs/beans/EmployeeServiceProcessor.java) 
prefixes the path param `bob` with `Hello world`

