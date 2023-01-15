pipeline{
    agent any
    stages{
        stage("Build"){
            steps{
                sh 'cd /var/lib/jenkins/workspace/javaprojectpipeline'
            sh 'gradle build'
            }
        }
    }
}
