// Pipeline Docker-Python
pipeline {
    agent any
    environment {
        DOCKER_IMAGE = 'python:3.12.1'
    }
    stages {
        stage('build') {
            steps {
                script {
                    echo "Start building..."
                    echo "Welcome to Docker pipeline-python"
                    sh "docker run --rm ${DOCKER_IMAGE} python --version"
                }
            }
        }
        stage('test') {
            steps {
                script {
                    echo "Start testing..."
                    sleep 2
                    sh "docker -v"
                    sh "docker images"
                    sh "docker run --rm ${DOCKER_IMAGE} pip list"
                }
            }
        }
        stage('congratulations') {
            steps {
                script {
                    echo "Everything is working correctly"
                    sleep 1
                    echo "Congratulations!"
                }
            }
        }
    }
}