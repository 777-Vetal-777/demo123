pipeline{
    agent any
    stages{
        stage("Build"){
            sh 'gradle build -x test'
        }
    }
}
