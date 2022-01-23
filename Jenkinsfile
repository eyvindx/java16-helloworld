pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Running build automatation'
        sh './gradlew build --no-daemon'
        archiveArtifacts artifacts: 'dist/file.zip'
      
      }
    
    }
  
  }

}
