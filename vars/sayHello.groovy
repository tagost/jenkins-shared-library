#!/usr/bin/env groovy
def call(String name = 'human') {
  pipeline {
  agent any
  stages {
    stage('Deploy test') {
      when {
        expression {
          BRANCH_NAME =~ 'main'
        }

      }
      environment{
        COMMIT="1234565"
      }
      steps {
        sh "echo ${BRANCH_NAME}"
        sh "echo ${BRANCH_NAME}"
      }
    }

  }
}
}
