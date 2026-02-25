pipeline {
    agent any
    stages {
        stage("pull") {
            steps {
                git 'https://github.com/amishajadhav58/deleteafter.git'            }
        }
        stage('Build') {
            steps { 
                sh 'echo "this is bulid stage"'
            }
        }
        stage('Test') {
            steps {
                sh 'echo "this is test stage"'        
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo "this is deploy stage"'
            }
        }
    }
}
