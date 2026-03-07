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
        stage('Docker login') {
            steps {
                echo 'Docker login started.';
                sh 'docker login -u vaibhavnangia2001@gmail.com -p Qwerty@123'
                echo 'Docker login completed.';
            }
        }
        stage('Docker build') {
            steps {
                echo 'Docker build started.';
                sh 'docker build -t vn2001/test-jenkins-project:latest .'
                echo 'Docker build completed.';
            }
        }
        stage('Docker run') {
            steps {
                echo 'Docker run started.';
                sh 'docker run -d vn2001/test-jenkins-project:latest'
                echo 'Docker run completed.';
            }
        }
        stage('Docker push') {
            steps {
                echo 'Docker push started.';
                sh 'docker push vn2001/test-jenkins-project:latest'
                echo 'Docker push completed.';
            }
        }
    }
}