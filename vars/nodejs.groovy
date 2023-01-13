def call() {
    node {

        stage ('checkout code') {
            git branch: 'main', url: 'https://github.com/Skaur501/cart.git'
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