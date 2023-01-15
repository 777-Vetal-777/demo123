pipeline{
    agent any
    tools {
        gradle 'Gradle'
    }
    stages{
        stage("Build"){
            steps{
                                   sh 'ls'
                                   sh 'gradle build'

            }
        }

        stage("Deploy"){
        steps{
sshPublisher(publishers: [sshPublisherDesc(configName: 'MyWebServerTest', transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: 'ls', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '', remoteDirectorySDF: false, removePrefix: '', sourceFiles: '**/demo-0.0.2-SNAPSHOT.war')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])        }
        }
    }
}
