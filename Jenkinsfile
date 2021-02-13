pipeline {
    stages {
        stage('Build') { 
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Generate Docker Image'){
            steps{
                sh 'docker build -t spring-demo .'
            }
        }
    }
}
