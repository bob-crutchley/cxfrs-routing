## Camel Routing in JBoss Fuse
This is an example project for creating Apache Camel Routes on the JBoss Fuse platform, 
the routes are exposed by using CXFRS

### Getting Started
#### Creating the OSGI bundle
An OSGI bundle can be created by running this maven command at the root of the project:
```bash
mvn clean install
```
The artifact will genrated and stored in the `target/` directory
and in your `~/.m2` repository.
#### Installing the OSGI Bundle into JBoss Fuse
Before deploying the bundle, ensure that JBoss Fuse has been configured. 
See [Configuring JBoss Fuse](docs/configuring-jboss-fuse.md)

In the **JBoss Fuse client**, install the bundle using maven:
```bash
osgi:install -s mvn:org.bob.cxfrs/example/0.0.1-SNAPSHOT
```
JBoss Fuse will install the bundle from your local `~/.m2` repository
The `-s` option will start the bundle once it is installed.

#### Managing OSGI Bundles
All of the following examples are executed in the **JBboss Fuse client** 
##### Listing Bundles
`osgi:list` can be used to show all bundles:
```
JBossFuse:admin@root> osgi:list
START LEVEL 100 , List Threshold: 50
   ID   State         Blueprint      Spring    Level  Name
[ 294] [Active     ] [            ] [Started] [   80] example (0.0.1.SNAPSHOT)
```
This is useful for getting the IDs of bundles so that they can be interacted with
##### Starting and stopping
These commands can be used to start, stop and restart OSGI bundles respectively:
- `osgi:start <bundle-id>`
- `osgi:stop <bundle-id>`
- `osgi:restart <bundle-id>`
##### Updating
When you have built the project again with Maven, 
the changes can be applied to the running bundle by updating it:
```bash
osgi:update <bundle-id>
```
##### Uninstalling
Just as bundles can be installed, they may also be uninstalled:
```bash
osgi:uninstall <bundle-id>
```

