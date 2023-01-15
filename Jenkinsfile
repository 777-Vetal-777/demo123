pipeline{
    tools{
        gradle ''Gradle
    }
    agent any
    stages{
        stage("Build"){
            steps{
            sh 'pwd'
            sh 'gradle build'
            sh 'pwd'
            }
        }
    }
}
