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
            echo 'Code compile'
        }

        stage ('code quality') {
            echo 'Code quality'
        }

        stage ('Test cases') {
            echo 'Test cases'
        }

        stage ('Publish a release') {
            echo 'Publish a release'
        }
    }
}
