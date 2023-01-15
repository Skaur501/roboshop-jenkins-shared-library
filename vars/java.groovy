def call() {
    node {
        try {
            common.checkout()
            common.compile("java")
            common.codeQuality()
            common.release()
        }
        catch (errors) {
        }
    }
}
