pipeline{
    agent any
    stages{
        stage("Build"){
            steps{
                            sh 'pwd'
            sh 'gradle build /var/lib/jenkins/workspace/javaprojectpipeline'
            }
        }
    }
}
