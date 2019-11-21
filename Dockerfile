FROM tomcat:9.0.27-jdk11-openjdk
RUN rm -rf /urs/local/tomcat/webapps/*
ADD devops-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh", "run"]