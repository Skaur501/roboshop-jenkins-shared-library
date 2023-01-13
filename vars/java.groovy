def call() {
    node {

        stage ('checkout code') {
            git branch: 'main', url: "${env.REPO_URL}"
        }

        stage ('code quality') {
            echo 'Code quality'
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
