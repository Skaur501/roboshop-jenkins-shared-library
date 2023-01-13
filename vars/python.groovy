def call() {
    node {

        stage ('checkout code') {
            git branch: 'main', url: "${env.REPO_URL}"
        }

        stage ('code quality') {
        }

        stage ('Test cases') {
        }

        stage ('Publish a release') {
        }
    }
}

