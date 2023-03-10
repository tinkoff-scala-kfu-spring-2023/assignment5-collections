FROM sbtscala/scala-sbt:eclipse-temurin-focal-17.0.5_8_1.8.2_2.13.10
COPY . /files
ENTRYPOINT ["/files/entrypoint.sh"]
