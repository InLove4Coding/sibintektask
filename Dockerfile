FROM amazoncorretto:11
COPY target/sibintek.jar sibintek.jar
ENTRYPOINT java -jar sibintek.jar