Pipeline {
	agent any
	stages {
		stage('Build') {
			steps {
				sh 'cd Quest2; ./gradlew build'
			}
		}
		stage('Test') {
			steps {
				sh 'cd Qwest2; ./gradlew test'
			}
		}
	}
}
