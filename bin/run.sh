#!/bin/bash

# compile
javac -verbose ../src/main/java/com/michalhynek/fibonacci/calculator/*.java ../src/main/java/com/michalhynek/fibonacci/util/*.java ../src/main/java/com/michalhynek/fibonacci/Main.java -d ../target/classes/
jar cvmf fibonacci.mf fibonacci.jar -C ../target/classes .

# run
java -jar ./fibonacci.jar