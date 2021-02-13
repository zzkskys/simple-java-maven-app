pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Run'){
            steps{
                sh 'java -jar ./target/demo-0.0.1-SNAPSHOT.jar'
            }
        }
//          stage('Generate Docker Image'){
//             steps{
//                 sh 'docker build -t spring-demo .'
//             }
//          }
    }
}
