pipeline {
    agent any

    environment {
        JOB_NAME="Pipeline-Job-GitHub"
        OWNER="Matvey-Guralskiy"
        POSITION="DevOps engineer"
    }

    stages {
        stage('Pipeline-Job Build') {
            steps {
                echo "Starting BUILD for Pipeline-Job"
                sh '''
                sleep 2
                ls -l /var
                pwd
                netstat
                '''
                echo "Processing..."
            }
        }
        stage('Pipeline-Job Test') {
            steps {
                sh "sleep 2"
                echo "Starting a TEST Configuration for Pipeline-Job"
                sh '''
                ls -a /var
                sleep 1
                ifconfig -a
                echo "TEST was successfully"
                '''
            }
        }
        stage('Pipeline-Job Finish') {
            steps {
                echo "The Job is work correct"
                echo "Build end successfully"
                echo "Test end successfully"
                sh "sleep 1"
                echo "\nHave a nice day!"
            }
        }
        stage('Enviroments') {
            steps {
                echo "The Jenkins Job name is: ${JOB_NAME}"
                echo "The owner of this job it's me: ${OWNER}"
                echo "I'm Studying Jenkins to become ${POSITION}"
            }
        }
        stage('Congratulations') {
            steps {
                echo "Congratulations on your success"
            }
        }
    }
}
