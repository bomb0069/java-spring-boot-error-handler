# java-spring-boot-error-handler

## How to Start

```cmd
./gradlew bootRun
```

## How to Test with Newman (Postman Command)

```cmd
cd tests
newman run get-user-with-exception.json -d api-version.json -e environment/localhost-8080.json 
cd ..
```