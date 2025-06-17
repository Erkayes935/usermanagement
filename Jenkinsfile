pipeline {
    agent any
    environment {
        DOCKER_IMAGE = "user-management:latest"
        DOCKER_REGISTRY = "docker.io/refiakarsista/user-management:latest"
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Erkayes935/repository.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Docker Build & Push') {
            steps {
                sh 'docker build -t $DOCKER_IMAGE .'
                sh 'docker tag $DOCKER_IMAGE $DOCKER_REGISTRY'
                sh 'docker push $DOCKER_REGISTRY'
            }
        }
        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply -f k8s/deployment.yaml'
                sh 'kubectl apply -f k8s/service.yaml'
                sh 'kubectl apply -f k8s/ingress.yaml'
            }
        }
    }
}