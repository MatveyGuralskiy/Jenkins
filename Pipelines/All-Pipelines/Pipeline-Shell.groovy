pipeline {
    agent any

    stages {
        stage('Pipeline-Shell') {
            steps {
                echo "Pipeline-Shell will run some shell commands"
                sh '''
                sleep 2
                ls -l /etc
                ifconfig | grep inet
                hostname
                '''
            }
        }
        stage('Message') {
            steps {
                sh "sleep 2"
                echo "Have a nice day!"
                echo "from Pipeline-Shell"
            }
        }
    }
}
