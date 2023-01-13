def checkout() {
    stage('Checkout Code') {
        cleanWs()
        git branch: 'main', url: "${env.REPO_URL}"
    }
}

def compile(appType) {
    stage('Compile Code') {
        if (appType == "java") {
            sh 'mvn clean compile'
        }

        if (appType == "golang") {
            sh 'go mod init'
        }
    }
}

def codeQuality() {
    stage('Code Quality') {
        //echo 'Code Quality'
        sh "sonar-scanner -Dsonar.login=admin -Dsonar.password=admin123 -Dsonar.host.url=http://172.31.13.67 -Dsonar.privateKey=${COMPONENT}"
    }
}

def release() {
    stage('Publish a release') {
        echo 'publish a release'
    }
}

