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
            }
        }
    }

//     agent {
//         docker {
//             image 'maven:3-alpine'
//             args '-v /root/.m2:/root/.m2'
//         }
//     }
//     stages {
//         stage('Build') {
//             steps {
//                 sh 'mvn -B -DskipTests clean package'
//             }
//         }
//          stage('Build Dockerfile') {
//            steps {
//                sh 'docker build -t spring-demo .'
//            }
//        }
//    }
}
