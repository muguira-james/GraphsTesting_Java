These are various studies of java

There are 3 projects here:

+ GraphDB_v0 - the basic data structure
+ Qwest2 - A study in JUnit and Cucumber testing using the Graph ADT
+ BackRiver - a study in placing the Graph behind a Spring boot REST service


The basic idea is to create a Graph ADT.  This study only implements the Adjcency List version of a Graph (vs. the Adjcency Matrix).  

The project flows from the basic Graph ADT (GraphDB_v0) to Qwest2, which is a full example of applying Cucmber to handle BDD, to BackRiver.  BackRiver changed the GraphDB ADT to make better use of the JSON package Jackson (default Jackson wants methods of the form: getSomething, setSomething to generate JSON).

Notice that BackRiver and Qwest2 are gradle projects.

These projects are linked to from my blog (https://muguira-james.github.io):

+ GraphDB_v0 is the sample code for "JUint Testing in Java"
+ Qwest2 is the sample code for "Cucumber Testing in Java"

