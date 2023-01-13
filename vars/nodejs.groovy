def call() {
    node {

        stage ('code quality') {
            steps{
                echo 'code quality'
            }
        }

        stage ('Test cases') {
            steps {
                echo 'test cases'
            }
        }

        stage ('Publish a release') {
            steps {
                echo 'Publish a release'
            }
        }
    }
}