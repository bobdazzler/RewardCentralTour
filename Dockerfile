FROM adoptopenjdk/openjdk15:ubi
COPY build/libs/rewardCentralTour-1.0.0.jar rewardCentralTour.jar
EXPOSE 8084
ENTRYPOINT ["java", "-jar", "rewardCentralTour.jar"]