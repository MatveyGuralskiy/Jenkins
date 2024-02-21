pipeline {
    agent {
        docker { 
            image 'python:latest'
        }
    }
    stages {
        stage('Pipeline-Docker Build') {
            steps {
                echo "Starting BUILD for Pipeline-Job"
                sh '''
                uptime
                netstat
                '''
                echo "Processing..."
            }
        }
        stage('Pipeline-Docker Test') {
            steps {
                sh "sleep 2"
                echo "Starting a TEST Configuration for Pipeline-Job"
                sh 'python --version'
                echo "TEST was successfully"
                
            }
        }
        stage('Pipeline-Docker Finish') {
            steps {
                echo "The Job is work correct"
                echo "Build end successfully"
                echo "Test end successfully"
                sh "sleep 1"
                echo "\nHave a nice day!"
            }
        }
        stage('Congratulations') {
            steps {
                echo "Congratulations on your success"
                echo "Docker works correctly!"
            }
        }
    }
}