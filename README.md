
# Witch Saga 

Test for geekseat 


## Tech

Witch saga on this test uses a number of open source projects to work properly:
- [JDK](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html) - Java 8 
- [maven](https://maven.apache.org/download.cgi) - Build tools
- [Spring boot 2.7.3](https://spring.io/projects/spring-boot/) - Spring framework
- [Project Lombok](https://projectlombok.org/) - Reduce boilerplate code
- [AssertJ core](https://www.javadoc.io/doc/org.assertj) - Assertion unit test
- [Swagger UI](https://springfox.github.io/springfox/docs/current/) - API documentation
- [SonarLint](https://www.sonarlint.org/) - Clean code analyzer


## Installation

Witch saga requires [Java 8](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html/)+, and [maven](https://maven.apache.org/download.cgi) to run.


```sh
mvn clean install package
mvn spring-boot:run
```

Witch saga backend api can be accessed
```sh
http://127.0.0.1:8080
```

or better, by using swagger ui
```sh
http://127.0.0.1:8080/swagger-ui/
```

