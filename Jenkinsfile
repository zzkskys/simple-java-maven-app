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
                docker.build("spring-demo").push()
            }
        }

//         stage('Docker-Build'){
//             agent any
//             steps{
//                 sh 'docker build -t spring-demo .'
//             }
//         }
//         stage('Docker-Run'){
//             agent any
//             steps{
//                 sh 'docker rm -f spring-demo'
//                 sh 'docker run --name spring-demo -d -p 8081:8081 spring-demo'
//                 sh 'docker run --name spring-demo -d -p 8081:8081 -v /root/spring-demo/config:/spring-demo/config -v /root/spring-demo/data:/spring-demo/data spring-demo'
//             }
//         }
    }
}

