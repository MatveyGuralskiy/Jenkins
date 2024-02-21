pipeline {
    agent any

    stages {
        stage('Pipeline-Job') {
            steps {
                echo "It's my first pipeline"
                echo "It's a very simple sample of pipeline in Jenkins"
                sh "ls -l"
            }
        }
    }
}
