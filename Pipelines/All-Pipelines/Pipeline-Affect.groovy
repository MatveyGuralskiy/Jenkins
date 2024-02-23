pipeline {
    agent any

    environment {
        JOB_NAME = "Pipeline-Affect"
        OWNER = "Matvey-Guralskiy"
        POSITION = "DevOps engineer"
        LOADING = '-\\|/'
    }

    stages {
        stage('Starting a Build') {
            steps {
                echo "Starting a Build for a Job"
                echo "Loading..."
                script {
                    AFFECT()
                }
                echo "\nThe Build is done, let's check if it works correctly\n"
            }
        }
        stage('Starting a Test for a Job') {
            steps {
                echo "Starting a Test Configuration for a Job"
                sh '''
                echo "List of directory Etc"
                ls -la /etc/
                sleep 2
                echo "List of All ports"
                netstat -tulpn
                echo "Test was successful"
                '''
            }
        }
        stage('Finishing a Job') {
            steps {
                echo "Finishing a Job..."
                script {
                    AFFECT()
                }
                echo "The Job is work correct"
                echo "Build end successfully"
                echo "Test end successfully"
                sh "sleep 2"
                echo "\nHave a nice day!"
            }
        }
        stage('Environments') {
            steps {
                echo "The Jenkins Job name is: ${JOB_NAME}"
                echo "Number of Build is: ${BUILD_ID}"
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

def AFFECT() {
    def END_TIME = (System.currentTimeMillis() / 1000) + 2
    while (System.currentTimeMillis() / 1000 < END_TIME) {
        for (def i = 0; i < LOADING.size(); i++) {
            def c = LOADING[i]
            printf("\rLogging in... %s ", c)
            sleep 0.5
        }
    }
    println()
}