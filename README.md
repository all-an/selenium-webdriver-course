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
- Selenium
- JUnit
- Cucumber 1.2.5

## Criando projeto:

```bash
mvn archetype:generate "-DarchetypeGroupId=io.cucumber" "-DarchetypeArtifactId=cucumber-archetype" "-DarchetypeVersion=7.0.0" "-DgroupId=course-selenium" "-DartifactId=course-selenium" "-Dpackage=course-selenium" "-Dversion=1.0.0-SNAPSHOT" "-DinteractiveMode=false"
```

## Dependências:

```xml
<dependency>
    <groupId>info.cukes</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>1.2.5</version>
</dependency>

<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.141.59</version>
</dependency>
```

## Autor do curso:

Qazando cursos

## Aluno:

Allan Abrahão