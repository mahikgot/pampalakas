# Trigger a real StackOverflowError

- STATUS: OPEN
- PRIORITY: 100
- TAGS: jvm

## Task
Trigger a real StackOverflowError via unbounded recursion and a real heap OOM
via unbounded list growth. Run both at `-Xss256k` vs `-Xss8m`.

## Question
How does changing `-Xss` change how many frames it takes to overflow -
can you back out an approximate per-frame stack size from the data?

## Notes
### stack
one stack frame with no variables inside is about 85bytes.
had a problem here where i thought the -Xss was not setting the stack size,
turns out the option had to be before the class/java file.

JAVA 21
`-Xss` stack
`-Xms` minimum heap
`-Xmx` maximum heap
jvm options:
https://docs.oracle.com/en/java/javase/21/docs/specs/man/java.html

### heap
FOR 64 bit JVM:
one array has 4 metadata entries THEN the values
one Integer has 3 metadata entries THEN the value  

object field/class references are 8 bytes each on 64bit machines (since that is the address size)
can be compressed into 4 bytes by using `-XX:+UseCompressedOops` and `-XX:+UseCompresseedClassPointers`,
this is called Ordinary object pointers (OOPs)

Integer has 12 bytes of metadata and 4 bytes of data

an arraylist has itself and points to an array with references to the objects

so it is 64bytes(ArrayList object) + (8*4)(array metadata) + (8*N) + (objectSize*N)

if we add an integer to an arraylist, we add a total of 24 bytes (array reference+integersize)
java heap:
https://developer.ibm.com/articles/j-codetoheap/
