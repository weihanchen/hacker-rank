Topic of Strings
===
* [Java Strings Introduction](#java-strings-introduction)
* [Java Substring](#java-substring)
* [Compare](#compare)

## Java Strings Introduction
### Methods
* `Character.toUpperCase(chart)`

### Explanation
A has a length of , and  has a length of ; the sum of their lengths is .
When sorted alphabetically/lexicographically, "hello" comes before "java"; therefore,  is not larger than  and the answer is No.

When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java".
### [Track](https://www.hackerrank.com/challenges/java-strings-introduction)
### [Solution](./strings/Introduction.java)

## Java Substring
### Methods
* `String.substring(start, end)`

### Sample Input
```
Helloworld
3 7
```

### Sample Output
```
lowo
```

### [Track](https://www.hackerrank.com/challenges/java-substring)
### [Solution](./strings/SubString.java)

## Compare
Given a string, find out the lexicographically smallest and largest substring of length .

[Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]

### Methods
* `String.compare(a)`
* `String.substring(start, end)`

### Sample Input
```
welcometojava
3
```

### Sample Output
```
ava
wel
```

### [Track](https://www.hackerrank.com/challenges/java-string-compare)
### [Solution](./strings/Compare.java)
