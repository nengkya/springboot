[Getting Started](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html)

[modifier](https://www.w3schools.com/java/java_modifiers.asp)

[extends](https://www.w3schools.com/java/ref_keyword_extends.asp)

[implements](https://www.w3schools.com/java/ref_keyword_implements.asp)

[gradle Eclipse](https://www.vogella.com/tutorials/EclipseGradle/article.html#updating-classpath-with-the-latest-changes-in-the-build-file)

[markdown](https://www.markdownguide.org/basic-syntax/)


Create file src/main/java/DemoApplication.java

```java
package com.example.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

$ mvn spring-boot:run
```
