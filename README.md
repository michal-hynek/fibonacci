# Fibonacci Calculator

# How to Run
## Compile and run with Maven
- Compile and package the output to a jar `mvn clean package assembly:single`
- Run the packaged jar file `java -jar ./target/fibonacci-1.0-SNAPSHOT-jar-with-dependencies.jar`

## Compile and run using shell script
- cd into the bin directory
- Add executable permissions to run.sh `chmod +x run.sh`
- Run the script `./run.sh`

The script compiles the application into an executable jar and runs the jar.


# Sample Output

```
---------------------------------------------------------
| FIBONACCI CALCULATOR                                  |
---------------------------------------------------------

Enter how many Fibonacci numbers you want to print out: 30
0
1
1
2
3
5
8
13
21
34
55
89
144
233
377
610
987
1597
2584
4181
6765
10946
17711
28657
46368
75025
121393
196418
317811
514229
```

# Implementation Notes
There are three source classes in total: `Main`, `NumberUtil`, and `FibonacciCalculator`.
## Main
It is run when the application runs since it contains the main method.

## NumberUtil
It contains a utility method that checks whether the input is a valid integer.  It is used by `Main` to verify user input.

## FibonacciCalculator
It contains the method that calculates Fibonacci numbers.  I decided to use an iterative algorithm because recursive algorithm was throwing StackOverFlowExcecptions for large inputs.  This is because Java doesn't support tail recursion.
