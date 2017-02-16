Topic of Introduction
===
* [Java Output Formatting](#java-output-formatting)
* [Java Loops I](#java-loops-i)
* [Java Loops II](#java-loops-ii)

## Java Output Formatting

### Sample Input
```
java 100
cpp 65
python 50
```
### Sample Output
```
================================
java           100
cpp            065
python         050
================================
```
### Explanation
Each String is left-justified with trailing whitespace through the first  characters. The leading digit of the integer is the  character, and each integer that was less than  digits now has leading zeroes.
### [Track](https://www.hackerrank.com/challenges/java-output-formatting)
### [Solution](./introduction/OutputFormatting.java)

## Java Loops I
### Methods
* `String.compareTo()`

### Sample Input
```
2
```
### Sample Output
```
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
```
### Task
Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.
### [Track](https://www.hackerrank.com/challenges/java-loops-i)
### [Solution](./introduction/LoopI.java)

## Java Loops II
You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

We use the integers , , and  to create the following series:

`(a + 2^0 *b), (a + 2^0 *b + 2^1 * b), (a + 2^0 *b + 2^1 *b + ... + 2^n - 1 *b)`

### Methods
`recursive of power`

### Sample Input
```
2
0 2 10
5 3 5
```
### Sample Output
```
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
```

### [Track](https://www.hackerrank.com/challenges/java-loops)
### [Solution](./introduction/LoopII.java)

## Java Datatypes

### Input Format
```
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
```

### Sample Output
```
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
```

### Explanation
-150 can be stored in a short, an int, or a long.

213333333333333333333333333333333333 is very large and is outside of the allowable range of values for the primitive data types discussed in this problem.

### [Track](https://www.hackerrank.com/challenges/java-datatypes)
### [Solution](./introduction/Datatypes.java)
