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
        sh "sonar-scanner -Dsonar.login=admin -Dsonar.password=admin123 -Dsonar.host.url=http://172.31.13.67:9000 -Dsonar.projectKey=${env.COMPONENT} "
    }
}

def release() {
    stage('Publish a release') {
        echo 'publish a release'
    }
}

def mail() {
    stage() {
        mail bcc: '', body: "<h1>Pipeline Failure</h1><br>Project Name: ${COMPONENT}\nURL = ${BUILD_URL}", cc: '', charset: 'UTF-8', from: 'sarbjeetaur310@gmail.com', mimeType: 'text/html', replyTo: 'sarbjeetaur310@gmail.com', subject: "ERROR CI: Component Name - ${COMPONENT}", to: "sarbjeetaur310@gmail.com"
        sh 'exit 1' // if exit is not equal to 0 then mark build as failure. so it will show buil as failure at the end
    }
}
