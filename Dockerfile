FROM openjdk:11

USER root

ENV ARTIFACT_NAME=fizzbuzz
ENV ARTIFACT_PATH=/build/libs
ENV PORT=8080
ENV APP_HOME=/opt/app
ENV ARTIFACT=${ARTIFACT_NAME}.jar

RUN apt-get update
RUN mkdir -p /opt/app
COPY --chown=1001:0 ${ARTIFACT_PATH}/${ARTIFACT} ${APP_HOME}/${ARTIFACT}

WORKDIR ${APP_HOME}
EXPOSE ${PORT}

ENTRYPOINT java ${JAVA_OPTS} -jar ${ARTIFACT}
