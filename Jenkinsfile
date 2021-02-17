pipeline {
    agent none
    stages{
        stage('Build'){
            agent{
                docker{
                    image 'maven:3-alpine'
                    args '-v /root/.m2:/root/.m2'
                }
            }
            steps{
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Docker-Build'){
            agent any
            steps{
                sh 'docker build -t spring-demo .'
                sh 'docker rm -f spring-demo'
                sh 'docker run --name spring-demo -d -p 8081:8081 spring-demo'
            }
        }
    }
}
