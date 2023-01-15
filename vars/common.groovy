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
        mail bcc: '', body: "<b>Example</b><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> URL de build: ${env.BUILD_URL}", cc: '', charset: 'UTF-8', from: 'sarbjeetkaur310@gmail.com', mimeType: 'text/html', replyTo: 'sarbjeetkaur310@gmail.com', subject: "ERROR CI: Project name -> ${env.JOB_NAME}", to: "sarbjeetkaur310@gmail.com";

    }
}
