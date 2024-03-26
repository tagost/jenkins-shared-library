#!/usr/bin/env groovy
def call(String name = 'human') {
  pipeline {
  agent none
  stages {
    stage('Deploy test') {
      when {
        expression {
          BRANCH_NAME =~ 'okd-develop*'
        }

      }
      steps {
        sh "echo ${BRANCH_NAME}"
      }
    }

  }
}
}
