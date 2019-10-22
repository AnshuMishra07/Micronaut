FROM oracle/graalvm-ce:19.2.0.1 as graalvm
COPY . /home/app/micronaut-app
WORKDIR /home/app/micronaut-app
RUN gu install native-image
RUN native-image --no-server -cp build/libs/micronaut-app-*-all.jar

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/micronaut-app .
ENTRYPOINT ["./micronaut-app"]
