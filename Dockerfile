FROM gradle:8.1.6-jdk8 as builder
WORKDIR /app
COPY . /app
RUN gradle clean build

FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY --from=builder /app /app
CMD ["gradle", "test"]