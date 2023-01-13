def call() {
    node {

        common.checkout()
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