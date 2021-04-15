# Fizz Buzz Backend

The project needs Java 11 runtime.

To build the application, run
```shell
./gradlew build
```

You can run the application with gradle using
```shell
./gradlew bootRun
```

After a successful build, you can build a Docker image with
```shell
docker build .
```

The application listens on port `8080`, which is exposed by the Docker image.

The application provides two endpoints:
- `/element/{element}` converts an element according to the Fizz Buzz rules
- `/sequence/{limit}` returns the Fizz Buzz sequence until the provided limit

You can directly try the endpoints on the integrated Swagger UI on `/swagger-ui.html`.
