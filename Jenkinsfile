properties([pipelineTriggers([githubPush()])])

pipeline {
     agent {
            label 'github-ci'
     }

    stages{
     /* checkout repo */
        stage('Checkout SCM') {
            steps {
                checkout([
                 $class: 'GitSCM',
                 branches: [[name: 'master']],
                 userRemoteConfigs: [[
                    url: 'https://github.com/zzkskys/simple-java-maven-app.git',
                    credentialsId: 'github-personal-access-token',
                 ]]
                ])
            }
        }

        stage('Build'){
            agent{
                docker{
                    image 'maven:3-alpine'
                    args '-v /root/.m2:/root/.m2'
                }
            }
            steps{
                sh 'mvn -B -DskipTests clean package'
                sh 'mvn dockerfile:build'
            }
        }

        stage('Docker-Run'){
            agent any
            steps{
                sh 'docker rm -f spring-demo'
                sh 'docker run --name spring-demo -d -p 8081:8081 -v /root/spring-demo/config:/spring-demo/config -v /root/spring-demo/data:/spring-demo/data zzk/demo'
            }
        }
    }
}

