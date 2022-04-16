## Selenium e Cucumber


## Curso Udemy - Automação de Testes com Selenium WebDriver e Java - Qazando Cursos - Abril 2022

Automação de Testes com Selenium WebDriver e Java

<p align="center">
        <a href="https://www.linkedin.com/in/allan-pereira-abrahao/">
            <img align="center" width="200" height="181"  src="/selenium-logo.png" />
        </a>
</p>

## Requisitos para execução:

- Java 17
- Selenium 3
- JUnit 5
- Cucumber 7
- Cluecumber 2.8

## Criando projeto:

```bash
mvn archetype:generate "-DarchetypeGroupId=io.cucumber" "-DarchetypeArtifactId=cucumber-archetype" "-DarchetypeVersion=7.0.0" "-DgroupId=course-selenium" "-DartifactId=course-selenium" "-Dpackage=course-selenium" "-Dversion=1.0.0-SNAPSHOT" "-DinteractiveMode=false"
```

## Criando reports com Cluecumber

```bash
mvn cluecumber-report:reporting

```

## Algumas Dependências:

```xml
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-junit-platform-engine</artifactId>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-core</artifactId>
    <version>7.2.3</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.141.59</version>
</dependency>
<!-- https://mvnrepository.com/artifact/com.trivago.rta/cluecumber-report-plugin -->
<dependency>
    <groupId>com.trivago.rta</groupId>
    <artifactId>cluecumber-report-plugin</artifactId>
    <version>2.8.0</version>
</dependency>

<dependency>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>3.0.0-M5</version>
</dependency>


```

## Autor do curso:

Qazando cursos

## Aluno:

Allan Abrahão