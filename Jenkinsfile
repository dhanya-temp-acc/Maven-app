pipeline {
    agent any

    tools {
        maven 'Maven'   // Name configured in Jenkins (Global Tool Config)
        jdk 'JDK21'     // Optional but recommended
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Deploy to Nexus') {
            steps {
                sh 'mvn deploy'
            }
        }
    }

    post {
        success {
            echo 'Build & Deploy Successful 🚀'
        }
        failure {
            echo 'Build Failed ❌'
        }
    }
}