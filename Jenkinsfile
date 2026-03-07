{
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'maven cleaning package.';
                sh 'mvn clean package'
                echo 'maven cleaning completed.';
            }
        }
        stage('Testing') {
            steps {
                echo 'maven test started.';
                sh 'mvn test'
                echo 'maven test completed.';
            }
        }
        stage('Compile') {
            steps {
                echo 'maven compile started.';
                sh 'mvn compile'
                echo 'maven compile completed.';
            }
        }
    }
}