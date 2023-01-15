pipeline{
    agent any
    tools{
        gradle 'Gradle'
    }
    stages{
        stage("Build"){
            steps{
                   sh './gradlew build'
            }
        }
    }
}
