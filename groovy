pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
                git credentialsId: 'github-token', url: 'https://github.com/username/repo.git'
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    docker.build('your-image-name')
                }
            }
        }
        stage('Run Docker Container') {
            steps {
                script {
                    docker.run('your-image-name')
                }
            }
        }
    }
}
