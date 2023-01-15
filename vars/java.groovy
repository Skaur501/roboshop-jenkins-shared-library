def call() {
    node {
        try {
            common.checkout()
            common.compile("java")
            common.codeQuality()
            common.release()
        }
        catch (errors) {
            mail bcc: '', body: "<b>Example</b><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> URL de build: ${env.BUILD_URL}", cc: '', charset: 'UTF-8', from: 'sarbjeetkaur310@gmail.com', mimeType: 'text/html', replyTo: 'sarbjeetkaur310@gmail.com', subject: "ERROR CI: Project name -> ${env.JOB_NAME}", to: "sarbjeetkaur310@gmail.com";
        }
    }
}
