def call(repo){    
    steps.checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'trnayak11', url: repo]])  
}