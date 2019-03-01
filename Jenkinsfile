pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'sh \'cd Qwest2; ./gradlew clean build\''
      }
    }
  }
}