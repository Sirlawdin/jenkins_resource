def buildApp() {
    echo 'building the application'
    sh 'npm install'
    sh 'npm build'
    
}

def testApp() {
    echo 'testing the application...'
}

def deployApp() {

    echo 'deploying the application...'
    echo "deploying version ${params.VERSION}"
}

// All environment variables in Jenkinsfile are available in the groovy script


return this // This helps you import the groovy function into Jenkinsfile.