FROM gitpod/workspace-full:latest

# Install Java 17
RUN sudo apt-get update && sudo apt-get install -y openjdk-17-jdk
RUN sudo update-alternatives --set java /usr/lib/jvm/java-17-openjdk-amd64/bin/java

# Install Maven 3.8.1
RUN wget https://downloads.apache.org/maven/maven-3/3.8.1/binaries/apache-maven-3.8.1-bin.tar.gz -P /tmp
RUN sudo tar xf /tmp/apache-maven-3.8.1-bin.tar.gz -C /opt
RUN sudo ln -s /opt/apache-maven-3.8.1/bin/mvn /usr/bin/mvn

# Install Gradle
RUN sudo apt-get install -y gradle
