FROM l.gcr.io/google/bazel:latest

WORKDIR  /src/workspace

COPY bin .

RUN bazel clean

CMD ["run", "//src/main:BazelApp"]
