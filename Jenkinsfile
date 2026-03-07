pipeline {
    agent any
    stages {
        stage('Check Java') {
            steps {
                sh 'java -version'
                sh 'javac -version'
                sh 'mvn -version'
                sh 'echo $JAVA_HOME'
            }
        }
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