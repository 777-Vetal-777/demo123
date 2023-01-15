pipeline{
    agent any
    tools{
        gradle 'Gradle'
    }
    stages{
        stage("Build"){
            steps{
                   sh 'gradle build'
            }
        }
    }
}
