# Теория и практика контейнеры
## Spring-boot приложение
[TddApplication.kt](src/main/kotlin/ru/edutech/demo/tdd/TddApplication.kt) - точка входа в приложение
## Сборка
[pom.xml](pom.xml)
```sh
mvn clean install
```

## Старт приложения
```sh
mvn spring-boot:run
```
## Сборка docker образа
[Dockerfile](Dockerfile)
```sh
docker build -t $image:$tag .
```
