# Kotlin Spring Boot 템플릿

> 목표: 유지보수성, 확장성, 개발 편의성을 고려한 Kotlin Spring Boot 프로젝트의 표준 보일러플레이트

기술 스택:
- Java: 21.0.7 (JVM)
- Kotlin: 1.9.25
- Spring Boot: 3.5.0
- Spring Starter Web
- Gradle

## Getting started 

### build
```shell
./gradlew build
```
### run 
```shell
./gradle bootRun 
```
### test
- [Kotest](https://kotest.io/docs/quickstart/) 
- [mockK](https://mockk.io/)

- Controller, Service Unit test 샘플 예제 
  - `src/test/kotlin/com/sample` 디렉토리 참조 
```shell
./gradlew test
```

### Formator 
- [Ktlint](https://github.com/JLLeitschuh/ktlint-gradle)

- kotlin lint check
```shell
./gradlew ktlintCheck
```
- kotlin lint fix
```shell
./gradlew ktlintFormat
```
