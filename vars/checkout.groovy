def call(repo){    
    steps.checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'gopa1990', url: repo]])  
}
