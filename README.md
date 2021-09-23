# Line Length

### Description
Simple library to calculate length of a line for a cartesian coordinate.

### Requirement
- Gradle 7.2
- Java (JDK 11)
- JUnit 5

### How to test
```
./gradlew test
```

### How to build
```
./gradlew build
```

### How to use
1. Casually import this library to your project.
2. Instantiate a line using Line class. Use the getLength() method.
```
//example to find the length between (1, 1) and (4, 5)
Line line = new Line(1, 1, 4, 5);
double length = line.getLength();
```
