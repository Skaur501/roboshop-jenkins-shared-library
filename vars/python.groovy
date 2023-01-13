def call() {
    node {

        common.checkout()
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

