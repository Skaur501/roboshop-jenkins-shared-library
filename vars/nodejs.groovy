def call() {
    node {

        stage ('checkout code') {
            cleanWs() // cleanup the old content and print the latest content
            sh 'pwd' // print the path
            sh 'ls'   // files n that path
            git branch: 'main', url: "${env.REPO_URL}"
            sh 'pwd'
            sh 'ls'
        }

        stage ('code Compile') {
            echo 'Code Compile'
        }

        stage ('code quality') {
            echo 'code quality'
        }

        stage ('Test cases') {
            echo 'Test cases'
        }

        stage ('Publish a release') {
            echo 'Publish a release'
        }
    }
}