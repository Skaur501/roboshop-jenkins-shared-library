def call() {
    node {

        stage ('checkout code') {
            cleanWs()
            sh 'pwd'
            sh 'ls'
            git branch: 'main', url: "${env.REPO_URL}"
            sh 'pwd'
        }

        stage ('code Compile') {
            echo 'Code quality'
        }

        stage ('code quality') {
        }

        stage ('Test cases') {
        }

        stage ('Publish a release') {
        }
    }
}

